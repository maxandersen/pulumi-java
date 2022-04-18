// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.compute_alpha.inputs.DiskInstantiationConfigArgs;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A specification of the parameters to use when creating the instance template from a source instance.
 * 
 */
public final class SourceInstanceParamsArgs extends com.pulumi.resources.ResourceArgs {

    public static final SourceInstanceParamsArgs Empty = new SourceInstanceParamsArgs();

    /**
     * Attached disks configuration. If not provided, defaults are applied: For boot disk and any other R/W disks, new custom images will be created from each disk. For read-only disks, they will be attached in read-only mode. Local SSD disks will be created as blank volumes.
     * 
     */
    @Import(name="diskConfigs")
      private final @Nullable Output<List<DiskInstantiationConfigArgs>> diskConfigs;

    public Output<List<DiskInstantiationConfigArgs>> diskConfigs() {
        return this.diskConfigs == null ? Codegen.empty() : this.diskConfigs;
    }

    public SourceInstanceParamsArgs(@Nullable Output<List<DiskInstantiationConfigArgs>> diskConfigs) {
        this.diskConfigs = diskConfigs;
    }

    private SourceInstanceParamsArgs() {
        this.diskConfigs = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SourceInstanceParamsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<DiskInstantiationConfigArgs>> diskConfigs;

        public Builder() {
    	      // Empty
        }

        public Builder(SourceInstanceParamsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.diskConfigs = defaults.diskConfigs;
        }

        public Builder diskConfigs(@Nullable Output<List<DiskInstantiationConfigArgs>> diskConfigs) {
            this.diskConfigs = diskConfigs;
            return this;
        }
        public Builder diskConfigs(@Nullable List<DiskInstantiationConfigArgs> diskConfigs) {
            this.diskConfigs = Codegen.ofNullable(diskConfigs);
            return this;
        }
        public Builder diskConfigs(DiskInstantiationConfigArgs... diskConfigs) {
            return diskConfigs(List.of(diskConfigs));
        }        public SourceInstanceParamsArgs build() {
            return new SourceInstanceParamsArgs(diskConfigs);
        }
    }
}
