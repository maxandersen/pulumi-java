// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.logz.inputs;

import com.pulumi.azurenative.logz.enums.ManagedIdentityTypes;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class IdentityPropertiesArgs extends ResourceArgs {

    public static final IdentityPropertiesArgs Empty = new IdentityPropertiesArgs();

    @Import(name="type")
    private @Nullable Output<Either<String,ManagedIdentityTypes>> type;

    public Optional<Output<Either<String,ManagedIdentityTypes>>> type() {
        return Optional.ofNullable(this.type);
    }

    private IdentityPropertiesArgs() {}

    private IdentityPropertiesArgs(IdentityPropertiesArgs $) {
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IdentityPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IdentityPropertiesArgs $;

        public Builder() {
            $ = new IdentityPropertiesArgs();
        }

        public Builder(IdentityPropertiesArgs defaults) {
            $ = new IdentityPropertiesArgs(Objects.requireNonNull(defaults));
        }

        public Builder type(@Nullable Output<Either<String,ManagedIdentityTypes>> type) {
            $.type = type;
            return this;
        }

        public Builder type(Either<String,ManagedIdentityTypes> type) {
            return type(Output.of(type));
        }

        public Builder type(String type) {
            return type(Either.ofLeft(type));
        }

        public Builder type(ManagedIdentityTypes type) {
            return type(Either.ofRight(type));
        }

        public IdentityPropertiesArgs build() {
            return $;
        }
    }

}
