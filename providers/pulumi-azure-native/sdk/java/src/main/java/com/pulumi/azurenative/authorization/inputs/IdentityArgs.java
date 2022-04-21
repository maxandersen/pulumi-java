// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.authorization.inputs;

import com.pulumi.azurenative.authorization.enums.ResourceIdentityType;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Identity for the resource.
 * 
 */
public final class IdentityArgs extends com.pulumi.resources.ResourceArgs {

    public static final IdentityArgs Empty = new IdentityArgs();

    /**
     * The identity type. This is the only required field when adding a system assigned identity to a resource.
     * 
     */
    @Import(name="type")
    private @Nullable Output<ResourceIdentityType> type;

    public Optional<Output<ResourceIdentityType>> type() {
        return Optional.ofNullable(this.type);
    }

    private IdentityArgs() {}

    private IdentityArgs(IdentityArgs $) {
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IdentityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IdentityArgs $;

        public Builder() {
            $ = new IdentityArgs();
        }

        public Builder(IdentityArgs defaults) {
            $ = new IdentityArgs(Objects.requireNonNull(defaults));
        }

        public Builder type(@Nullable Output<ResourceIdentityType> type) {
            $.type = type;
            return this;
        }

        public Builder type(ResourceIdentityType type) {
            return type(Output.of(type));
        }

        public IdentityArgs build() {
            return $;
        }
    }

}
