// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetEngineVersionsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetEngineVersionsArgs Empty = new GetEngineVersionsArgs();

    /**
     * The location (region or zone) to list versions for.
     * Must exactly match the location the cluster will be deployed in, or listed
     * versions may not be available. If `location`, `region`, and `zone` are not
     * specified, the provider-level zone must be set and is used instead.
     * 
     */
    @Import(name="location")
      private final @Nullable String location;

    public Optional<String> location() {
        return this.location == null ? Optional.empty() : Optional.ofNullable(this.location);
    }

    /**
     * ID of the project to list available cluster versions for. Should match the project the cluster will be deployed to.
     * Defaults to the project that the provider is authenticated with.
     * 
     */
    @Import(name="project")
      private final @Nullable String project;

    public Optional<String> project() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    /**
     * If provided, the provider will only return versions
     * that match the string prefix. For example, `1.11.` will match all `1.11` series
     * releases. Since this is just a string match, it&#39;s recommended that you append a
     * `.` after minor versions to ensure that prefixes such as `1.1` don&#39;t match
     * versions like `1.12.5-gke.10` accidentally. See [the docs on versioning schema](https://cloud.google.com/kubernetes-engine/versioning-and-upgrades#versioning_scheme)
     * for full details on how version strings are formatted.
     * 
     */
    @Import(name="versionPrefix")
      private final @Nullable String versionPrefix;

    public Optional<String> versionPrefix() {
        return this.versionPrefix == null ? Optional.empty() : Optional.ofNullable(this.versionPrefix);
    }

    public GetEngineVersionsArgs(
        @Nullable String location,
        @Nullable String project,
        @Nullable String versionPrefix) {
        this.location = location;
        this.project = project;
        this.versionPrefix = versionPrefix;
    }

    private GetEngineVersionsArgs() {
        this.location = null;
        this.project = null;
        this.versionPrefix = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEngineVersionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String location;
        private @Nullable String project;
        private @Nullable String versionPrefix;

        public Builder() {
    	      // Empty
        }

        public Builder(GetEngineVersionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.location = defaults.location;
    	      this.project = defaults.project;
    	      this.versionPrefix = defaults.versionPrefix;
        }

        public Builder location(@Nullable String location) {
            this.location = location;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }
        public Builder versionPrefix(@Nullable String versionPrefix) {
            this.versionPrefix = versionPrefix;
            return this;
        }        public GetEngineVersionsArgs build() {
            return new GetEngineVersionsArgs(location, project, versionPrefix);
        }
    }
}
