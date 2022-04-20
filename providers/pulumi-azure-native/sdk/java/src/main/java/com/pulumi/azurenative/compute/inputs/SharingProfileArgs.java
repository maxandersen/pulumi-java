// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.inputs;

import com.pulumi.azurenative.compute.enums.GallerySharingPermissionTypes;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Profile for gallery sharing to subscription or tenant
 * 
 */
public final class SharingProfileArgs extends com.pulumi.resources.ResourceArgs {

    public static final SharingProfileArgs Empty = new SharingProfileArgs();

    /**
     * This property allows you to specify the permission of sharing gallery. &lt;br&gt;&lt;br&gt; Possible values are: &lt;br&gt;&lt;br&gt; **Private** &lt;br&gt;&lt;br&gt; **Groups**
     * 
     */
    @Import(name="permissions")
      private final @Nullable Output<Either<String,GallerySharingPermissionTypes>> permissions;

    public Output<Either<String,GallerySharingPermissionTypes>> permissions() {
        return this.permissions == null ? Codegen.empty() : this.permissions;
    }

    public SharingProfileArgs(@Nullable Output<Either<String,GallerySharingPermissionTypes>> permissions) {
        this.permissions = permissions;
    }

    private SharingProfileArgs() {
        this.permissions = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SharingProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Either<String,GallerySharingPermissionTypes>> permissions;

        public Builder() {
    	      // Empty
        }

        public Builder(SharingProfileArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.permissions = defaults.permissions;
        }

        public Builder permissions(@Nullable Output<Either<String,GallerySharingPermissionTypes>> permissions) {
            this.permissions = permissions;
            return this;
        }
        public Builder permissions(@Nullable Either<String,GallerySharingPermissionTypes> permissions) {
            this.permissions = Codegen.ofNullable(permissions);
            return this;
        }        public SharingProfileArgs build() {
            return new SharingProfileArgs(permissions);
        }
    }
}
