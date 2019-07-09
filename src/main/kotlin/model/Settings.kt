package model

import java.io.Serializable

private const val DEFAULT_BASE_ACTIVITY_CLASS = "androidx.appcompat.app.AppCompatActivity"
private const val DEFAULT_BASE_FRAGMENT_CLASS = "androidx.fragment.app.Fragment"
private val DEFAULT_MVP_TEMPLATE = "package ${Variable.PACKAGE_NAME.value}\n\nimport ${Variable.ANDROID_COMPONENT_FULL_CLASS_NAME.value}\n\nclass ${Variable.NAME.value}${Variable.ANDROID_COMPONENT_NAME.value} : ${Variable.ANDROID_COMPONENT_CLASS_NAME.value}"
private val JAVA_MVP_TEMPLATE = "package ${Variable.PACKAGE_NAME.value};\n\nimport ${Variable.ANDROID_COMPONENT_FULL_CLASS_NAME.value};\n\nclass ${Variable.NAME.value}${Variable.ANDROID_COMPONENT_NAME.value} extends ${Variable.ANDROID_COMPONENT_CLASS_NAME.value} {}"


private val DEFAULT_VIEW_TEMPLATE = "package ${Variable.PACKAGE_NAME.value}\n\ninterface ${Variable.NAME.value}${Variable.SCREEN_ELEMENT.value}"

private fun defaultScreenElements() = mutableListOf(
        ScreenElement("View", JAVA_MVP_TEMPLATE, FileType.JAVA, "${Variable.NAME.value}${Variable.ANDROID_COMPONENT_NAME.value}"),
        ScreenElement("Controller", FileType.JAVA.defaultTemplate, FileType.JAVA, FileType.JAVA.defaultFileName),
        ScreenElement("Repositories", FileType.JAVA.defaultTemplate, FileType.JAVA, FileType.JAVA.defaultFileName),
        ScreenElement("Layout", FileType.LAYOUT_XML.defaultTemplate, FileType.LAYOUT_XML, FileType.LAYOUT_XML.defaultFileName)


//        val viewElement = ScreenElement("View", "package ${Variable.PACKAGE_NAME.value}\n\nimport ${Variable.ANDROID_COMPONENT_FULL_CLASS_NAME.value}\n\nclass ${Variable.NAME.value}${Variable.ANDROID_COMPONENT_NAME.value} : ${Variable.ANDROID_COMPONENT_CLASS_NAME.value}", FileType.JAVA, "${Variable.NAME.value}${Variable.ANDROID_COMPONENT_NAME.value}")
//val controllerElement = ScreenElement("Controller", FileType.KOTLIN.defaultTemplate, FileType.JAVA, FileType.KOTLIN.defaultFileName)
//val repoElement = ScreenElement("Repositories", FileType.KOTLIN.defaultTemplate, FileType.JAVA, FileType.KOTLIN.defaultFileName)
//val layoutElement = ScreenElement("layout", FileType.LAYOUT_XML.defaultTemplate, FileType.LAYOUT_XML, FileType.LAYOUT_XML.defaultFileName)
)

data class Settings(var screenElements: MutableList<ScreenElement> = defaultScreenElements(),
               var activityBaseClass: String = DEFAULT_BASE_ACTIVITY_CLASS,
               var fragmentBaseClass: String = DEFAULT_BASE_FRAGMENT_CLASS) : Serializable