// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.elasticsan.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class IscsiTargetInfoResponse {
    /**
     * @return State of the operation on the resource.
     * 
     */
    private final String provisioningState;
    /**
     * @return Operational status of the iSCSI Target.
     * 
     */
    private final @Nullable String status;
    /**
     * @return iSCSI Target IQN (iSCSI Qualified Name); example: &#34;iqn.2005-03.org.iscsi:server&#34;.
     * 
     */
    private final String targetIqn;
    /**
     * @return iSCSI Target Portal Host Name
     * 
     */
    private final String targetPortalHostname;
    /**
     * @return iSCSI Target Portal Port
     * 
     */
    private final Integer targetPortalPort;

    @CustomType.Constructor
    private IscsiTargetInfoResponse(
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("status") @Nullable String status,
        @CustomType.Parameter("targetIqn") String targetIqn,
        @CustomType.Parameter("targetPortalHostname") String targetPortalHostname,
        @CustomType.Parameter("targetPortalPort") Integer targetPortalPort) {
        this.provisioningState = provisioningState;
        this.status = status;
        this.targetIqn = targetIqn;
        this.targetPortalHostname = targetPortalHostname;
        this.targetPortalPort = targetPortalPort;
    }

    /**
     * @return State of the operation on the resource.
     * 
     */
    public String provisioningState() {
        return this.provisioningState;
    }
    /**
     * @return Operational status of the iSCSI Target.
     * 
     */
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }
    /**
     * @return iSCSI Target IQN (iSCSI Qualified Name); example: &#34;iqn.2005-03.org.iscsi:server&#34;.
     * 
     */
    public String targetIqn() {
        return this.targetIqn;
    }
    /**
     * @return iSCSI Target Portal Host Name
     * 
     */
    public String targetPortalHostname() {
        return this.targetPortalHostname;
    }
    /**
     * @return iSCSI Target Portal Port
     * 
     */
    public Integer targetPortalPort() {
        return this.targetPortalPort;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IscsiTargetInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String provisioningState;
        private @Nullable String status;
        private String targetIqn;
        private String targetPortalHostname;
        private Integer targetPortalPort;

        public Builder() {
    	      // Empty
        }

        public Builder(IscsiTargetInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.provisioningState = defaults.provisioningState;
    	      this.status = defaults.status;
    	      this.targetIqn = defaults.targetIqn;
    	      this.targetPortalHostname = defaults.targetPortalHostname;
    	      this.targetPortalPort = defaults.targetPortalPort;
        }

        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder status(@Nullable String status) {
            this.status = status;
            return this;
        }
        public Builder targetIqn(String targetIqn) {
            this.targetIqn = Objects.requireNonNull(targetIqn);
            return this;
        }
        public Builder targetPortalHostname(String targetPortalHostname) {
            this.targetPortalHostname = Objects.requireNonNull(targetPortalHostname);
            return this;
        }
        public Builder targetPortalPort(Integer targetPortalPort) {
            this.targetPortalPort = Objects.requireNonNull(targetPortalPort);
            return this;
        }        public IscsiTargetInfoResponse build() {
            return new IscsiTargetInfoResponse(provisioningState, status, targetIqn, targetPortalHostname, targetPortalPort);
        }
    }
}
