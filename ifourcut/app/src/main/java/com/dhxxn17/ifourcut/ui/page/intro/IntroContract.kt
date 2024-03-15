package com.dhxxn17.ifourcut.ui.page.intro

import com.dhxxn17.ifourcut.ui.base.BaseUiAction
import com.dhxxn17.ifourcut.ui.base.BaseUiEffect
import com.dhxxn17.ifourcut.ui.base.BaseUiState
import com.dhxxn17.ifourcut.ui.base.CutStateList

class IntroContract {
    data class IntroState(
        val image: CutStateList<String>
    ): BaseUiState

    sealed class Action: BaseUiAction

    sealed class Effect: BaseUiEffect
}