plugins {
    kotlin("jvm") apply false
    id("gg.essential.multi-version.root")
}

preprocess {
    val fabric11802 = createNode("1.18.2-fabric", 11802, "official")
    val fabric11902 = createNode("1.19.2-fabric", 11902, "official")
    val fabric11904 = createNode("1.19.4-fabric", 11904, "official")
    val fabric12001 = createNode("1.20.1-fabric", 12001, "official")
    val fabric12101 = createNode("1.21.1-fabric", 12101, "official")

    fabric12101.link(fabric11802)
    fabric12101.link(fabric11902)
    fabric12101.link(fabric11904)
    fabric12101.link(fabric12001)
}