package com.thewyp.socialnetwork.presentation.splash

import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.onNodeWithContentDescription
import androidx.navigation.NavController
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.thewyp.socialnetwork.presentation.MainActivity
import com.thewyp.socialnetwork.presentation.ui.theme.SocialNetworkTheme
import com.thewyp.socialnetwork.presentation.util.Screen
import com.thewyp.socialnetwork.util.Constants
import io.mockk.MockKAnnotations
import io.mockk.impl.annotations.RelaxedMockK
import io.mockk.verify
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.TestCoroutineDispatcher
import kotlinx.coroutines.test.runBlockingTest
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@ExperimentalCoroutinesApi
@RunWith(AndroidJUnit4::class)
class SplashScreenTest {

    @get:Rule
    val composeTestRule = createAndroidComposeRule<MainActivity>()

    @RelaxedMockK
    lateinit var navController: NavController

    private val dispatcher = TestCoroutineDispatcher()

    @Before
    fun setUp() {
        MockKAnnotations.init(this)
    }

    @Test
    fun splashScreen_displaysAndDisappears() = dispatcher.runBlockingTest {
        composeTestRule.setContent {
            SocialNetworkTheme {
                SplashScreen(
                    navController = navController,
                    dispatcher
                )
            }
        }

        composeTestRule.onNodeWithContentDescription("Logo").assertExists()

        advanceTimeBy(Constants.SPLASH_SCREEN_DURATION)
        verify {
            navController.popBackStack()
            navController.navigate(Screen.LoginScreen.route)
        }
    }
}