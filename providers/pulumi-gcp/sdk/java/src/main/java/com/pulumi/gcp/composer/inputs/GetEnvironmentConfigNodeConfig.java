// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.composer.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.composer.inputs.GetEnvironmentConfigNodeConfigIpAllocationPolicy;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GetEnvironmentConfigNodeConfig extends com.pulumi.resources.InvokeArgs {

    public static final GetEnvironmentConfigNodeConfig Empty = new GetEnvironmentConfigNodeConfig();

    @Import(name="diskSizeGb", required=true)
      private final Integer diskSizeGb;

    public Integer diskSizeGb() {
        return this.diskSizeGb;
    }

    @Import(name="enableIpMasqAgent", required=true)
      private final Boolean enableIpMasqAgent;

    public Boolean enableIpMasqAgent() {
        return this.enableIpMasqAgent;
    }

    @Import(name="ipAllocationPolicies", required=true)
      private final List<GetEnvironmentConfigNodeConfigIpAllocationPolicy> ipAllocationPolicies;

    public List<GetEnvironmentConfigNodeConfigIpAllocationPolicy> ipAllocationPolicies() {
        return this.ipAllocationPolicies;
    }

    @Import(name="machineType", required=true)
      private final String machineType;

    public String machineType() {
        return this.machineType;
    }

    @Import(name="maxPodsPerNode", required=true)
      private final Integer maxPodsPerNode;

    public Integer maxPodsPerNode() {
        return this.maxPodsPerNode;
    }

    @Import(name="network", required=true)
      private final String network;

    public String network() {
        return this.network;
    }

    @Import(name="oauthScopes", required=true)
      private final List<String> oauthScopes;

    public List<String> oauthScopes() {
        return this.oauthScopes;
    }

    @Import(name="serviceAccount", required=true)
      private final String serviceAccount;

    public String serviceAccount() {
        return this.serviceAccount;
    }

    @Import(name="subnetwork", required=true)
      private final String subnetwork;

    public String subnetwork() {
        return this.subnetwork;
    }

    @Import(name="tags", required=true)
      private final List<String> tags;

    public List<String> tags() {
        return this.tags;
    }

    @Import(name="zone", required=true)
      private final String zone;

    public String zone() {
        return this.zone;
    }

    public GetEnvironmentConfigNodeConfig(
        Integer diskSizeGb,
        Boolean enableIpMasqAgent,
        List<GetEnvironmentConfigNodeConfigIpAllocationPolicy> ipAllocationPolicies,
        String machineType,
        Integer maxPodsPerNode,
        String network,
        List<String> oauthScopes,
        String serviceAccount,
        String subnetwork,
        List<String> tags,
        String zone) {
        this.diskSizeGb = Objects.requireNonNull(diskSizeGb, "expected parameter 'diskSizeGb' to be non-null");
        this.enableIpMasqAgent = Objects.requireNonNull(enableIpMasqAgent, "expected parameter 'enableIpMasqAgent' to be non-null");
        this.ipAllocationPolicies = Objects.requireNonNull(ipAllocationPolicies, "expected parameter 'ipAllocationPolicies' to be non-null");
        this.machineType = Objects.requireNonNull(machineType, "expected parameter 'machineType' to be non-null");
        this.maxPodsPerNode = Objects.requireNonNull(maxPodsPerNode, "expected parameter 'maxPodsPerNode' to be non-null");
        this.network = Objects.requireNonNull(network, "expected parameter 'network' to be non-null");
        this.oauthScopes = Objects.requireNonNull(oauthScopes, "expected parameter 'oauthScopes' to be non-null");
        this.serviceAccount = Objects.requireNonNull(serviceAccount, "expected parameter 'serviceAccount' to be non-null");
        this.subnetwork = Objects.requireNonNull(subnetwork, "expected parameter 'subnetwork' to be non-null");
        this.tags = Objects.requireNonNull(tags, "expected parameter 'tags' to be non-null");
        this.zone = Objects.requireNonNull(zone, "expected parameter 'zone' to be non-null");
    }

    private GetEnvironmentConfigNodeConfig() {
        this.diskSizeGb = null;
        this.enableIpMasqAgent = null;
        this.ipAllocationPolicies = List.of();
        this.machineType = null;
        this.maxPodsPerNode = null;
        this.network = null;
        this.oauthScopes = List.of();
        this.serviceAccount = null;
        this.subnetwork = null;
        this.tags = List.of();
        this.zone = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEnvironmentConfigNodeConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer diskSizeGb;
        private Boolean enableIpMasqAgent;
        private List<GetEnvironmentConfigNodeConfigIpAllocationPolicy> ipAllocationPolicies;
        private String machineType;
        private Integer maxPodsPerNode;
        private String network;
        private List<String> oauthScopes;
        private String serviceAccount;
        private String subnetwork;
        private List<String> tags;
        private String zone;

        public Builder() {
    	      // Empty
        }

        public Builder(GetEnvironmentConfigNodeConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.diskSizeGb = defaults.diskSizeGb;
    	      this.enableIpMasqAgent = defaults.enableIpMasqAgent;
    	      this.ipAllocationPolicies = defaults.ipAllocationPolicies;
    	      this.machineType = defaults.machineType;
    	      this.maxPodsPerNode = defaults.maxPodsPerNode;
    	      this.network = defaults.network;
    	      this.oauthScopes = defaults.oauthScopes;
    	      this.serviceAccount = defaults.serviceAccount;
    	      this.subnetwork = defaults.subnetwork;
    	      this.tags = defaults.tags;
    	      this.zone = defaults.zone;
        }

        public Builder diskSizeGb(Integer diskSizeGb) {
            this.diskSizeGb = Objects.requireNonNull(diskSizeGb);
            return this;
        }
        public Builder enableIpMasqAgent(Boolean enableIpMasqAgent) {
            this.enableIpMasqAgent = Objects.requireNonNull(enableIpMasqAgent);
            return this;
        }
        public Builder ipAllocationPolicies(List<GetEnvironmentConfigNodeConfigIpAllocationPolicy> ipAllocationPolicies) {
            this.ipAllocationPolicies = Objects.requireNonNull(ipAllocationPolicies);
            return this;
        }
        public Builder ipAllocationPolicies(GetEnvironmentConfigNodeConfigIpAllocationPolicy... ipAllocationPolicies) {
            return ipAllocationPolicies(List.of(ipAllocationPolicies));
        }
        public Builder machineType(String machineType) {
            this.machineType = Objects.requireNonNull(machineType);
            return this;
        }
        public Builder maxPodsPerNode(Integer maxPodsPerNode) {
            this.maxPodsPerNode = Objects.requireNonNull(maxPodsPerNode);
            return this;
        }
        public Builder network(String network) {
            this.network = Objects.requireNonNull(network);
            return this;
        }
        public Builder oauthScopes(List<String> oauthScopes) {
            this.oauthScopes = Objects.requireNonNull(oauthScopes);
            return this;
        }
        public Builder oauthScopes(String... oauthScopes) {
            return oauthScopes(List.of(oauthScopes));
        }
        public Builder serviceAccount(String serviceAccount) {
            this.serviceAccount = Objects.requireNonNull(serviceAccount);
            return this;
        }
        public Builder subnetwork(String subnetwork) {
            this.subnetwork = Objects.requireNonNull(subnetwork);
            return this;
        }
        public Builder tags(List<String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }
        public Builder zone(String zone) {
            this.zone = Objects.requireNonNull(zone);
            return this;
        }        public GetEnvironmentConfigNodeConfig build() {
            return new GetEnvironmentConfigNodeConfig(diskSizeGb, enableIpMasqAgent, ipAllocationPolicies, machineType, maxPodsPerNode, network, oauthScopes, serviceAccount, subnetwork, tags, zone);
        }
    }
}
