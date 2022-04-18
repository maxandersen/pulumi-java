// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Describes the uri of a disk.
 * 
 */
public final class VirtualHardDiskArgs extends com.pulumi.resources.ResourceArgs {

    public static final VirtualHardDiskArgs Empty = new VirtualHardDiskArgs();

    /**
     * Specifies the virtual hard disk's uri.
     * 
     */
    @Import(name="uri")
      private final @Nullable Output<String> uri;

    public Output<String> uri() {
        return this.uri == null ? Codegen.empty() : this.uri;
    }

    public VirtualHardDiskArgs(@Nullable Output<String> uri) {
        this.uri = uri;
    }

    private VirtualHardDiskArgs() {
        this.uri = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualHardDiskArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> uri;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualHardDiskArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.uri = defaults.uri;
        }

        public Builder uri(@Nullable Output<String> uri) {
            this.uri = uri;
            return this;
        }
        public Builder uri(@Nullable String uri) {
            this.uri = Codegen.ofNullable(uri);
            return this;
        }        public VirtualHardDiskArgs build() {
            return new VirtualHardDiskArgs(uri);
        }
    }
}
