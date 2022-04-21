// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.media.inputs;

import com.pulumi.azurenative.media.enums.ManagedIdentityType;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class MediaServiceIdentityArgs extends com.pulumi.resources.ResourceArgs {

    public static final MediaServiceIdentityArgs Empty = new MediaServiceIdentityArgs();

    /**
     * The identity type.
     * 
     */
    @Import(name="type", required=true)
    private Output<Either<String,ManagedIdentityType>> type;

    public Output<Either<String,ManagedIdentityType>> type() {
        return this.type;
    }

    private MediaServiceIdentityArgs() {}

    private MediaServiceIdentityArgs(MediaServiceIdentityArgs $) {
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MediaServiceIdentityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MediaServiceIdentityArgs $;

        public Builder() {
            $ = new MediaServiceIdentityArgs();
        }

        public Builder(MediaServiceIdentityArgs defaults) {
            $ = new MediaServiceIdentityArgs(Objects.requireNonNull(defaults));
        }

        public Builder type(Output<Either<String,ManagedIdentityType>> type) {
            $.type = type;
            return this;
        }

        public Builder type(Either<String,ManagedIdentityType> type) {
            return type(Output.of(type));
        }

        public MediaServiceIdentityArgs build() {
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
