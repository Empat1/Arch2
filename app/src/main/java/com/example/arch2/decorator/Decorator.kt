package com.example.arch2.decorator

open class Decorator(val stringDecorator: StringDecorator) : StringDecorator {
    override fun job(arg: String) {
        stringDecorator.job(arg)
    }

}