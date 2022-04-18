// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * An instance-attached disk resource.
 * 
 */
public final class SavedDiskArgs extends com.pulumi.resources.ResourceArgs {

    public static final SavedDiskArgs Empty = new SavedDiskArgs();

    /**
     * Specifies a URL of the disk attached to the source instance.
     * 
     */
    @Import(name="sourceDisk")
      private final @Nullable Output<String> sourceDisk;

    public Output<String> sourceDisk() {
        return this.sourceDisk == null ? Codegen.empty() : this.sourceDisk;
    }

    public SavedDiskArgs(@Nullable Output<String> sourceDisk) {
        this.sourceDisk = sourceDisk;
    }

    private SavedDiskArgs() {
        this.sourceDisk = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SavedDiskArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> sourceDisk;

        public Builder() {
    	      // Empty
        }

        public Builder(SavedDiskArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sourceDisk = defaults.sourceDisk;
        }

        public Builder sourceDisk(@Nullable Output<String> sourceDisk) {
            this.sourceDisk = sourceDisk;
            return this;
        }
        public Builder sourceDisk(@Nullable String sourceDisk) {
            this.sourceDisk = Codegen.ofNullable(sourceDisk);
            return this;
        }        public SavedDiskArgs build() {
            return new SavedDiskArgs(sourceDisk);
        }
    }
}
