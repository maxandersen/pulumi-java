// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.artifactregistry_v1beta2.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


/**
 * MavenRepositoryConfig is maven related repository details. Provides additional configuration details for repositories of the maven format type.
 * 
 */
public final class MavenRepositoryConfigResponse extends com.pulumi.resources.InvokeArgs {

    public static final MavenRepositoryConfigResponse Empty = new MavenRepositoryConfigResponse();

    /**
     * The repository with this flag will allow publishing the same snapshot versions.
     * 
     */
    @Import(name="allowSnapshotOverwrites", required=true)
    private Boolean allowSnapshotOverwrites;

    public Boolean allowSnapshotOverwrites() {
        return this.allowSnapshotOverwrites;
    }

    /**
     * Version policy defines the versions that the registry will accept.
     * 
     */
    @Import(name="versionPolicy", required=true)
    private String versionPolicy;

    public String versionPolicy() {
        return this.versionPolicy;
    }

    private MavenRepositoryConfigResponse() {}

    private MavenRepositoryConfigResponse(MavenRepositoryConfigResponse $) {
        this.allowSnapshotOverwrites = $.allowSnapshotOverwrites;
        this.versionPolicy = $.versionPolicy;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MavenRepositoryConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MavenRepositoryConfigResponse $;

        public Builder() {
            $ = new MavenRepositoryConfigResponse();
        }

        public Builder(MavenRepositoryConfigResponse defaults) {
            $ = new MavenRepositoryConfigResponse(Objects.requireNonNull(defaults));
        }

        public Builder allowSnapshotOverwrites(Boolean allowSnapshotOverwrites) {
            $.allowSnapshotOverwrites = allowSnapshotOverwrites;
            return this;
        }

        public Builder versionPolicy(String versionPolicy) {
            $.versionPolicy = versionPolicy;
            return this;
        }

        public MavenRepositoryConfigResponse build() {
            $.allowSnapshotOverwrites = Objects.requireNonNull($.allowSnapshotOverwrites, "expected parameter 'allowSnapshotOverwrites' to be non-null");
            $.versionPolicy = Objects.requireNonNull($.versionPolicy, "expected parameter 'versionPolicy' to be non-null");
            return $;
        }
    }

}
