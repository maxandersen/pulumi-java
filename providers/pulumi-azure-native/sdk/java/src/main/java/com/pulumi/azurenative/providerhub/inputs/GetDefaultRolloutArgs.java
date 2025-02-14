// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.providerhub.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetDefaultRolloutArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDefaultRolloutArgs Empty = new GetDefaultRolloutArgs();

    /**
     * The name of the resource provider hosted within ProviderHub.
     * 
     */
    @Import(name="providerNamespace", required=true)
    private String providerNamespace;

    /**
     * @return The name of the resource provider hosted within ProviderHub.
     * 
     */
    public String providerNamespace() {
        return this.providerNamespace;
    }

    /**
     * The rollout name.
     * 
     */
    @Import(name="rolloutName", required=true)
    private String rolloutName;

    /**
     * @return The rollout name.
     * 
     */
    public String rolloutName() {
        return this.rolloutName;
    }

    private GetDefaultRolloutArgs() {}

    private GetDefaultRolloutArgs(GetDefaultRolloutArgs $) {
        this.providerNamespace = $.providerNamespace;
        this.rolloutName = $.rolloutName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDefaultRolloutArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDefaultRolloutArgs $;

        public Builder() {
            $ = new GetDefaultRolloutArgs();
        }

        public Builder(GetDefaultRolloutArgs defaults) {
            $ = new GetDefaultRolloutArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param providerNamespace The name of the resource provider hosted within ProviderHub.
         * 
         * @return builder
         * 
         */
        public Builder providerNamespace(String providerNamespace) {
            $.providerNamespace = providerNamespace;
            return this;
        }

        /**
         * @param rolloutName The rollout name.
         * 
         * @return builder
         * 
         */
        public Builder rolloutName(String rolloutName) {
            $.rolloutName = rolloutName;
            return this;
        }

        public GetDefaultRolloutArgs build() {
            $.providerNamespace = Objects.requireNonNull($.providerNamespace, "expected parameter 'providerNamespace' to be non-null");
            $.rolloutName = Objects.requireNonNull($.rolloutName, "expected parameter 'rolloutName' to be non-null");
            return $;
        }
    }

}
