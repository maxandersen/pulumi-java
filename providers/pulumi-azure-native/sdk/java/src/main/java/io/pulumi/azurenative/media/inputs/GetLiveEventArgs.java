// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetLiveEventArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetLiveEventArgs Empty = new GetLiveEventArgs();

    /**
     * The Media Services account name.
     * 
     */
    @Import(name="accountName", required=true)
      private final String accountName;

    public String accountName() {
        return this.accountName;
    }

    /**
     * The name of the live event, maximum length is 32.
     * 
     */
    @Import(name="liveEventName", required=true)
      private final String liveEventName;

    public String liveEventName() {
        return this.liveEventName;
    }

    /**
     * The name of the resource group within the Azure subscription.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    public GetLiveEventArgs(
        String accountName,
        String liveEventName,
        String resourceGroupName) {
        this.accountName = Objects.requireNonNull(accountName, "expected parameter 'accountName' to be non-null");
        this.liveEventName = Objects.requireNonNull(liveEventName, "expected parameter 'liveEventName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetLiveEventArgs() {
        this.accountName = null;
        this.liveEventName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLiveEventArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accountName;
        private String liveEventName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLiveEventArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.liveEventName = defaults.liveEventName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder accountName(String accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }
        public Builder liveEventName(String liveEventName) {
            this.liveEventName = Objects.requireNonNull(liveEventName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }        public GetLiveEventArgs build() {
            return new GetLiveEventArgs(accountName, liveEventName, resourceGroupName);
        }
    }
}
