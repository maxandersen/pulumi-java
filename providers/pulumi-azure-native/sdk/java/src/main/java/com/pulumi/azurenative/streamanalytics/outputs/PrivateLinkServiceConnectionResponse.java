// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.streamanalytics.outputs;

import com.pulumi.azurenative.streamanalytics.outputs.PrivateLinkConnectionStateResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PrivateLinkServiceConnectionResponse {
    /**
     * @return The ID(s) of the group(s) obtained from the remote resource that this private endpoint should connect to. Required on PUT (CreateOrUpdate) requests.
     * 
     */
    private final @Nullable List<String> groupIds;
    /**
     * @return A collection of read-only information about the state of the connection to the private remote resource.
     * 
     */
    private final @Nullable PrivateLinkConnectionStateResponse privateLinkServiceConnectionState;
    /**
     * @return The resource id of the private link service. Required on PUT (CreateOrUpdate) requests.
     * 
     */
    private final @Nullable String privateLinkServiceId;
    /**
     * @return A message passed to the owner of the remote resource with this connection request. Restricted to 140 chars.
     * 
     */
    private final String requestMessage;

    @CustomType.Constructor
    private PrivateLinkServiceConnectionResponse(
        @CustomType.Parameter("groupIds") @Nullable List<String> groupIds,
        @CustomType.Parameter("privateLinkServiceConnectionState") @Nullable PrivateLinkConnectionStateResponse privateLinkServiceConnectionState,
        @CustomType.Parameter("privateLinkServiceId") @Nullable String privateLinkServiceId,
        @CustomType.Parameter("requestMessage") String requestMessage) {
        this.groupIds = groupIds;
        this.privateLinkServiceConnectionState = privateLinkServiceConnectionState;
        this.privateLinkServiceId = privateLinkServiceId;
        this.requestMessage = requestMessage;
    }

    /**
     * @return The ID(s) of the group(s) obtained from the remote resource that this private endpoint should connect to. Required on PUT (CreateOrUpdate) requests.
     * 
     */
    public List<String> groupIds() {
        return this.groupIds == null ? List.of() : this.groupIds;
    }
    /**
     * @return A collection of read-only information about the state of the connection to the private remote resource.
     * 
     */
    public Optional<PrivateLinkConnectionStateResponse> privateLinkServiceConnectionState() {
        return Optional.ofNullable(this.privateLinkServiceConnectionState);
    }
    /**
     * @return The resource id of the private link service. Required on PUT (CreateOrUpdate) requests.
     * 
     */
    public Optional<String> privateLinkServiceId() {
        return Optional.ofNullable(this.privateLinkServiceId);
    }
    /**
     * @return A message passed to the owner of the remote resource with this connection request. Restricted to 140 chars.
     * 
     */
    public String requestMessage() {
        return this.requestMessage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateLinkServiceConnectionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> groupIds;
        private @Nullable PrivateLinkConnectionStateResponse privateLinkServiceConnectionState;
        private @Nullable String privateLinkServiceId;
        private String requestMessage;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivateLinkServiceConnectionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.groupIds = defaults.groupIds;
    	      this.privateLinkServiceConnectionState = defaults.privateLinkServiceConnectionState;
    	      this.privateLinkServiceId = defaults.privateLinkServiceId;
    	      this.requestMessage = defaults.requestMessage;
        }

        public Builder groupIds(@Nullable List<String> groupIds) {
            this.groupIds = groupIds;
            return this;
        }
        public Builder groupIds(String... groupIds) {
            return groupIds(List.of(groupIds));
        }
        public Builder privateLinkServiceConnectionState(@Nullable PrivateLinkConnectionStateResponse privateLinkServiceConnectionState) {
            this.privateLinkServiceConnectionState = privateLinkServiceConnectionState;
            return this;
        }
        public Builder privateLinkServiceId(@Nullable String privateLinkServiceId) {
            this.privateLinkServiceId = privateLinkServiceId;
            return this;
        }
        public Builder requestMessage(String requestMessage) {
            this.requestMessage = Objects.requireNonNull(requestMessage);
            return this;
        }        public PrivateLinkServiceConnectionResponse build() {
            return new PrivateLinkServiceConnectionResponse(groupIds, privateLinkServiceConnectionState, privateLinkServiceId, requestMessage);
        }
    }
}
