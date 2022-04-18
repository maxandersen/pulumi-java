// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetMachineImageArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetMachineImageArgs Empty = new GetMachineImageArgs();

    @Import(name="machineImage", required=true)
      private final String machineImage;

    public String machineImage() {
        return this.machineImage;
    }

    @Import(name="project")
      private final @Nullable String project;

    public Optional<String> project() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    public GetMachineImageArgs(
        String machineImage,
        @Nullable String project) {
        this.machineImage = Objects.requireNonNull(machineImage, "expected parameter 'machineImage' to be non-null");
        this.project = project;
    }

    private GetMachineImageArgs() {
        this.machineImage = null;
        this.project = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetMachineImageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String machineImage;
        private @Nullable String project;

        public Builder() {
    	      // Empty
        }

        public Builder(GetMachineImageArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.machineImage = defaults.machineImage;
    	      this.project = defaults.project;
        }

        public Builder machineImage(String machineImage) {
            this.machineImage = Objects.requireNonNull(machineImage);
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }        public GetMachineImageArgs build() {
            return new GetMachineImageArgs(machineImage, project);
        }
    }
}
