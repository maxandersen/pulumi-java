// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.recoveryservices.inputs;

import com.pulumi.azurenative.recoveryservices.inputs.DistributedNodesInfoResponse;
import com.pulumi.azurenative.recoveryservices.inputs.InquiryInfoResponse;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Extended information of the container.
 * 
 */
public final class AzureWorkloadContainerExtendedInfoResponse extends com.pulumi.resources.InvokeArgs {

    public static final AzureWorkloadContainerExtendedInfoResponse Empty = new AzureWorkloadContainerExtendedInfoResponse();

    /**
     * Host Os Name in case of Stand Alone and Cluster Name in case of distributed container.
     * 
     */
    @Import(name="hostServerName")
      private final @Nullable String hostServerName;

    public Optional<String> hostServerName() {
        return this.hostServerName == null ? Optional.empty() : Optional.ofNullable(this.hostServerName);
    }

    /**
     * Inquiry Status for the container.
     * 
     */
    @Import(name="inquiryInfo")
      private final @Nullable InquiryInfoResponse inquiryInfo;

    public Optional<InquiryInfoResponse> inquiryInfo() {
        return this.inquiryInfo == null ? Optional.empty() : Optional.ofNullable(this.inquiryInfo);
    }

    /**
     * List of the nodes in case of distributed container.
     * 
     */
    @Import(name="nodesList")
      private final @Nullable List<DistributedNodesInfoResponse> nodesList;

    public List<DistributedNodesInfoResponse> nodesList() {
        return this.nodesList == null ? List.of() : this.nodesList;
    }

    public AzureWorkloadContainerExtendedInfoResponse(
        @Nullable String hostServerName,
        @Nullable InquiryInfoResponse inquiryInfo,
        @Nullable List<DistributedNodesInfoResponse> nodesList) {
        this.hostServerName = hostServerName;
        this.inquiryInfo = inquiryInfo;
        this.nodesList = nodesList;
    }

    private AzureWorkloadContainerExtendedInfoResponse() {
        this.hostServerName = null;
        this.inquiryInfo = null;
        this.nodesList = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureWorkloadContainerExtendedInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String hostServerName;
        private @Nullable InquiryInfoResponse inquiryInfo;
        private @Nullable List<DistributedNodesInfoResponse> nodesList;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureWorkloadContainerExtendedInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hostServerName = defaults.hostServerName;
    	      this.inquiryInfo = defaults.inquiryInfo;
    	      this.nodesList = defaults.nodesList;
        }

        public Builder hostServerName(@Nullable String hostServerName) {
            this.hostServerName = hostServerName;
            return this;
        }
        public Builder inquiryInfo(@Nullable InquiryInfoResponse inquiryInfo) {
            this.inquiryInfo = inquiryInfo;
            return this;
        }
        public Builder nodesList(@Nullable List<DistributedNodesInfoResponse> nodesList) {
            this.nodesList = nodesList;
            return this;
        }
        public Builder nodesList(DistributedNodesInfoResponse... nodesList) {
            return nodesList(List.of(nodesList));
        }        public AzureWorkloadContainerExtendedInfoResponse build() {
            return new AzureWorkloadContainerExtendedInfoResponse(hostServerName, inquiryInfo, nodesList);
        }
    }
}
