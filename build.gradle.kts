plugins {
    kotlin("jvm")
    id("gg.essential.multi-version")
    id("gg.essential.defaults")
}

version = "${project.property("mod_version") as String}-${platform.mcVersionStr}"
group = project.property("maven_group") as String

base {
    archivesName.set(project.property("archives_base_name") as String)
}

dependencies {
    if (platform.isFabric) {
        modRuntimeOnly("net.fabricmc:fabric-language-kotlin:${project.property("kotlin_loader_version")}") {
            exclude(group = "net.fabricmc", module = "fabric-loader")
        }

        modImplementation("net.fabricmc.fabric-api:fabric-api:${project.property("fabric_version")}") {
            exclude(group = "net.fabricmc", module = "fabric-loader")
        }
    }
}