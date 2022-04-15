// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.peering.inputs;

import io.pulumi.azurenative.peering.inputs.BgpSessionArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The properties that define an exchange connection.
 * 
 */
public final class ExchangeConnectionArgs extends io.pulumi.resources.ResourceArgs {

    public static final ExchangeConnectionArgs Empty = new ExchangeConnectionArgs();

    /**
     * The BGP session associated with the connection.
     * 
     */
    @Import(name="bgpSession")
      private final @Nullable Output<BgpSessionArgs> bgpSession;

    public Output<BgpSessionArgs> bgpSession() {
        return this.bgpSession == null ? Codegen.empty() : this.bgpSession;
    }

    /**
     * The unique identifier (GUID) for the connection.
     * 
     */
    @Import(name="connectionIdentifier")
      private final @Nullable Output<String> connectionIdentifier;

    public Output<String> connectionIdentifier() {
        return this.connectionIdentifier == null ? Codegen.empty() : this.connectionIdentifier;
    }

    /**
     * The PeeringDB.com ID of the facility at which the connection has to be set up.
     * 
     */
    @Import(name="peeringDBFacilityId")
      private final @Nullable Output<Integer> peeringDBFacilityId;

    public Output<Integer> peeringDBFacilityId() {
        return this.peeringDBFacilityId == null ? Codegen.empty() : this.peeringDBFacilityId;
    }

    public ExchangeConnectionArgs(
        @Nullable Output<BgpSessionArgs> bgpSession,
        @Nullable Output<String> connectionIdentifier,
        @Nullable Output<Integer> peeringDBFacilityId) {
        this.bgpSession = bgpSession;
        this.connectionIdentifier = connectionIdentifier;
        this.peeringDBFacilityId = peeringDBFacilityId;
    }

    private ExchangeConnectionArgs() {
        this.bgpSession = Codegen.empty();
        this.connectionIdentifier = Codegen.empty();
        this.peeringDBFacilityId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExchangeConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<BgpSessionArgs> bgpSession;
        private @Nullable Output<String> connectionIdentifier;
        private @Nullable Output<Integer> peeringDBFacilityId;

        public Builder() {
    	      // Empty
        }

        public Builder(ExchangeConnectionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bgpSession = defaults.bgpSession;
    	      this.connectionIdentifier = defaults.connectionIdentifier;
    	      this.peeringDBFacilityId = defaults.peeringDBFacilityId;
        }

        public Builder bgpSession(@Nullable Output<BgpSessionArgs> bgpSession) {
            this.bgpSession = bgpSession;
            return this;
        }
        public Builder bgpSession(@Nullable BgpSessionArgs bgpSession) {
            this.bgpSession = Codegen.ofNullable(bgpSession);
            return this;
        }
        public Builder connectionIdentifier(@Nullable Output<String> connectionIdentifier) {
            this.connectionIdentifier = connectionIdentifier;
            return this;
        }
        public Builder connectionIdentifier(@Nullable String connectionIdentifier) {
            this.connectionIdentifier = Codegen.ofNullable(connectionIdentifier);
            return this;
        }
        public Builder peeringDBFacilityId(@Nullable Output<Integer> peeringDBFacilityId) {
            this.peeringDBFacilityId = peeringDBFacilityId;
            return this;
        }
        public Builder peeringDBFacilityId(@Nullable Integer peeringDBFacilityId) {
            this.peeringDBFacilityId = Codegen.ofNullable(peeringDBFacilityId);
            return this;
        }        public ExchangeConnectionArgs build() {
            return new ExchangeConnectionArgs(bgpSession, connectionIdentifier, peeringDBFacilityId);
        }
    }
}
