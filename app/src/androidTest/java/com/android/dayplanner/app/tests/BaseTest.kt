package com.android.dayplanner.app.tests

import androidx.test.core.app.ActivityScenario
import androidx.test.rule.GrantPermissionRule
import com.android.dayplanner.app.ui.MainActivity
import com.kaspersky.kaspresso.files.dirs.DirsProvider
import com.kaspersky.kaspresso.kaspresso.Kaspresso
import com.kaspersky.kaspresso.testcases.api.testcase.TestCase
import org.junit.After
import org.junit.Before
import org.junit.Rule

open class BaseTest : TestCase(kaspressoBuilder = Kaspresso.Builder.advanced{

}) {

    lateinit var activityScenario: ActivityScenario<MainActivity>

    @Before
    fun setUp() {
        activityScenario = ActivityScenario.launch(MainActivity::class.java)
    }

    @After
    fun tearDown() {
            activityScenario.close()

    }
}