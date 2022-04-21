// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.osconfig.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;


public final class PatchDeploymentPatchConfigGooGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final PatchDeploymentPatchConfigGooGetArgs Empty = new PatchDeploymentPatchConfigGooGetArgs();

    /**
     * goo update settings. Use this setting to override the default goo patch rules.
     * 
     */
    @Import(name="enabled", required=true)
    private Output<Boolean> enabled;

    public Output<Boolean> enabled() {
        return this.enabled;
    }

    private PatchDeploymentPatchConfigGooGetArgs() {}

    private PatchDeploymentPatchConfigGooGetArgs(PatchDeploymentPatchConfigGooGetArgs $) {
        this.enabled = $.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PatchDeploymentPatchConfigGooGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PatchDeploymentPatchConfigGooGetArgs $;

        public Builder() {
            $ = new PatchDeploymentPatchConfigGooGetArgs();
        }

        public Builder(PatchDeploymentPatchConfigGooGetArgs defaults) {
            $ = new PatchDeploymentPatchConfigGooGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder enabled(Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public PatchDeploymentPatchConfigGooGetArgs build() {
            $.enabled = Objects.requireNonNull($.enabled, "expected parameter 'enabled' to be non-null");
            return $;
        }
    }

}
