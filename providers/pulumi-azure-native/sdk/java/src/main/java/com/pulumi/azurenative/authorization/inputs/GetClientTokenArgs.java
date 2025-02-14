// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.authorization.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetClientTokenArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetClientTokenArgs Empty = new GetClientTokenArgs();

    /**
     * Optional authentication endpoint. Defaults to the endpoint of Azure Resource Manager.
     * 
     */
    @Import(name="endpoint")
    private @Nullable String endpoint;

    /**
     * @return Optional authentication endpoint. Defaults to the endpoint of Azure Resource Manager.
     * 
     */
    public Optional<String> endpoint() {
        return Optional.ofNullable(this.endpoint);
    }

    private GetClientTokenArgs() {}

    private GetClientTokenArgs(GetClientTokenArgs $) {
        this.endpoint = $.endpoint;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetClientTokenArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetClientTokenArgs $;

        public Builder() {
            $ = new GetClientTokenArgs();
        }

        public Builder(GetClientTokenArgs defaults) {
            $ = new GetClientTokenArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param endpoint Optional authentication endpoint. Defaults to the endpoint of Azure Resource Manager.
         * 
         * @return builder
         * 
         */
        public Builder endpoint(@Nullable String endpoint) {
            $.endpoint = endpoint;
            return this;
        }

        public GetClientTokenArgs build() {
            return $;
        }
    }

}
