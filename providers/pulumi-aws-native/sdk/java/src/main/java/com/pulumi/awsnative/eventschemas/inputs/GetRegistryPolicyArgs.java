// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.eventschemas.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetRegistryPolicyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRegistryPolicyArgs Empty = new GetRegistryPolicyArgs();

    @Import(name="id", required=true)
    private String id;

    public String id() {
        return this.id;
    }

    private GetRegistryPolicyArgs() {}

    private GetRegistryPolicyArgs(GetRegistryPolicyArgs $) {
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRegistryPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRegistryPolicyArgs $;

        public Builder() {
            $ = new GetRegistryPolicyArgs();
        }

        public Builder(GetRegistryPolicyArgs defaults) {
            $ = new GetRegistryPolicyArgs(Objects.requireNonNull(defaults));
        }

        public Builder id(String id) {
            $.id = id;
            return this;
        }

        public GetRegistryPolicyArgs build() {
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            return $;
        }
    }

}
