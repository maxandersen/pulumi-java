// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.imagebuilder.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ImageRecipeSystemsManagerAgent {
    /**
     * Controls whether the SSM agent is removed from your final build image, prior to creating the new AMI. If this is set to true, then the agent is removed from the final image. If it's set to false, then the agent is left in, so that it is included in the new AMI. The default value is false.
     * 
     */
    private final @Nullable Boolean uninstallAfterBuild;

    @CustomType.Constructor
    private ImageRecipeSystemsManagerAgent(@CustomType.Parameter("uninstallAfterBuild") @Nullable Boolean uninstallAfterBuild) {
        this.uninstallAfterBuild = uninstallAfterBuild;
    }

    /**
     * Controls whether the SSM agent is removed from your final build image, prior to creating the new AMI. If this is set to true, then the agent is removed from the final image. If it's set to false, then the agent is left in, so that it is included in the new AMI. The default value is false.
     * 
    */
    public Optional<Boolean> uninstallAfterBuild() {
        return Optional.ofNullable(this.uninstallAfterBuild);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ImageRecipeSystemsManagerAgent defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean uninstallAfterBuild;

        public Builder() {
    	      // Empty
        }

        public Builder(ImageRecipeSystemsManagerAgent defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.uninstallAfterBuild = defaults.uninstallAfterBuild;
        }

        public Builder uninstallAfterBuild(@Nullable Boolean uninstallAfterBuild) {
            this.uninstallAfterBuild = uninstallAfterBuild;
            return this;
        }        public ImageRecipeSystemsManagerAgent build() {
            return new ImageRecipeSystemsManagerAgent(uninstallAfterBuild);
        }
    }
}
