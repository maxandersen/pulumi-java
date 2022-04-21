// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.security.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * describe the properties of a security assessment object reference (by key)
 * 
 */
public final class AssignedComponentItemResponse extends com.pulumi.resources.InvokeArgs {

    public static final AssignedComponentItemResponse Empty = new AssignedComponentItemResponse();

    /**
     * unique key to a security assessment object
     * 
     */
    @Import(name="key")
    private @Nullable String key;

    public Optional<String> key() {
        return Optional.ofNullable(this.key);
    }

    private AssignedComponentItemResponse() {}

    private AssignedComponentItemResponse(AssignedComponentItemResponse $) {
        this.key = $.key;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AssignedComponentItemResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AssignedComponentItemResponse $;

        public Builder() {
            $ = new AssignedComponentItemResponse();
        }

        public Builder(AssignedComponentItemResponse defaults) {
            $ = new AssignedComponentItemResponse(Objects.requireNonNull(defaults));
        }

        public Builder key(@Nullable String key) {
            $.key = key;
            return this;
        }

        public AssignedComponentItemResponse build() {
            return $;
        }
    }

}
