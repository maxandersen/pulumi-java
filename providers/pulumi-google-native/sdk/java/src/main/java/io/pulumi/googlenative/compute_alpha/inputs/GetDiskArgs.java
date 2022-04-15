// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetDiskArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetDiskArgs Empty = new GetDiskArgs();

    @Import(name="disk", required=true)
      private final String disk;

    public String disk() {
        return this.disk;
    }

    @Import(name="project")
      private final @Nullable String project;

    public Optional<String> project() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    @Import(name="zone", required=true)
      private final String zone;

    public String zone() {
        return this.zone;
    }

    public GetDiskArgs(
        String disk,
        @Nullable String project,
        String zone) {
        this.disk = Objects.requireNonNull(disk, "expected parameter 'disk' to be non-null");
        this.project = project;
        this.zone = Objects.requireNonNull(zone, "expected parameter 'zone' to be non-null");
    }

    private GetDiskArgs() {
        this.disk = null;
        this.project = null;
        this.zone = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDiskArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String disk;
        private @Nullable String project;
        private String zone;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDiskArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disk = defaults.disk;
    	      this.project = defaults.project;
    	      this.zone = defaults.zone;
        }

        public Builder disk(String disk) {
            this.disk = Objects.requireNonNull(disk);
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }
        public Builder zone(String zone) {
            this.zone = Objects.requireNonNull(zone);
            return this;
        }        public GetDiskArgs build() {
            return new GetDiskArgs(disk, project, zone);
        }
    }
}
