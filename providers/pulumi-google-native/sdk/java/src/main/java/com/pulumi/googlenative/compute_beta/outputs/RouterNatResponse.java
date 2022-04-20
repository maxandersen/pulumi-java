// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.compute_beta.outputs.RouterNatLogConfigResponse;
import com.pulumi.googlenative.compute_beta.outputs.RouterNatRuleResponse;
import com.pulumi.googlenative.compute_beta.outputs.RouterNatSubnetworkToNatResponse;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class RouterNatResponse {
    /**
     * A list of URLs of the IP resources to be drained. These IPs must be valid static external IPs that have been assigned to the NAT. These IPs should be used for updating/patching a NAT only.
     * 
     */
    private final List<String> drainNatIps;
    /**
     * Enable Dynamic Port Allocation. If not specified, it is disabled by default. If set to true, - Dynamic Port Allocation will be enabled on this NAT config. - enableEndpointIndependentMapping cannot be set to true. - If minPorts is set, minPortsPerVm must be set to a power of two greater than or equal to 32. If minPortsPerVm is not set, a minimum of 32 ports will be allocated to a VM from this NAT config.
     * 
     */
    private final Boolean enableDynamicPortAllocation;
    private final Boolean enableEndpointIndependentMapping;
    /**
     * Timeout (in seconds) for ICMP connections. Defaults to 30s if not set.
     * 
     */
    private final Integer icmpIdleTimeoutSec;
    /**
     * Configure logging on this NAT.
     * 
     */
    private final RouterNatLogConfigResponse logConfig;
    /**
     * Maximum number of ports allocated to a VM from this NAT config when Dynamic Port Allocation is enabled. If Dynamic Port Allocation is not enabled, this field has no effect. If Dynamic Port Allocation is enabled, and this field is set, it must be set to a power of two greater than minPortsPerVm, or 64 if minPortsPerVm is not set. If Dynamic Port Allocation is enabled and this field is not set, a maximum of 65536 ports will be allocated to a VM from this NAT config.
     * 
     */
    private final Integer maxPortsPerVm;
    /**
     * Minimum number of ports allocated to a VM from this NAT config. If not set, a default number of ports is allocated to a VM. This is rounded up to the nearest power of 2. For example, if the value of this field is 50, at least 64 ports are allocated to a VM.
     * 
     */
    private final Integer minPortsPerVm;
    /**
     * Unique name of this Nat service. The name must be 1-63 characters long and comply with RFC1035.
     * 
     */
    private final String name;
    /**
     * Specify the NatIpAllocateOption, which can take one of the following values: - MANUAL_ONLY: Uses only Nat IP addresses provided by customers. When there are not enough specified Nat IPs, the Nat service fails for new VMs. - AUTO_ONLY: Nat IPs are allocated by Google Cloud Platform; customers can&#39;t specify any Nat IPs. When choosing AUTO_ONLY, then nat_ip should be empty.
     * 
     */
    private final String natIpAllocateOption;
    /**
     * A list of URLs of the IP resources used for this Nat service. These IP addresses must be valid static external IP addresses assigned to the project.
     * 
     */
    private final List<String> natIps;
    /**
     * A list of rules associated with this NAT.
     * 
     */
    private final List<RouterNatRuleResponse> rules;
    /**
     * Specify the Nat option, which can take one of the following values: - ALL_SUBNETWORKS_ALL_IP_RANGES: All of the IP ranges in every Subnetwork are allowed to Nat. - ALL_SUBNETWORKS_ALL_PRIMARY_IP_RANGES: All of the primary IP ranges in every Subnetwork are allowed to Nat. - LIST_OF_SUBNETWORKS: A list of Subnetworks are allowed to Nat (specified in the field subnetwork below) The default is SUBNETWORK_IP_RANGE_TO_NAT_OPTION_UNSPECIFIED. Note that if this field contains ALL_SUBNETWORKS_ALL_IP_RANGES or ALL_SUBNETWORKS_ALL_PRIMARY_IP_RANGES, then there should not be any other Router.Nat section in any Router for this network in this region.
     * 
     */
    private final String sourceSubnetworkIpRangesToNat;
    /**
     * A list of Subnetwork resources whose traffic should be translated by NAT Gateway. It is used only when LIST_OF_SUBNETWORKS is selected for the SubnetworkIpRangeToNatOption above.
     * 
     */
    private final List<RouterNatSubnetworkToNatResponse> subnetworks;
    /**
     * Timeout (in seconds) for TCP established connections. Defaults to 1200s if not set.
     * 
     */
    private final Integer tcpEstablishedIdleTimeoutSec;
    /**
     * Timeout (in seconds) for TCP connections that are in TIME_WAIT state. Defaults to 120s if not set.
     * 
     */
    private final Integer tcpTimeWaitTimeoutSec;
    /**
     * Timeout (in seconds) for TCP transitory connections. Defaults to 30s if not set.
     * 
     */
    private final Integer tcpTransitoryIdleTimeoutSec;
    /**
     * Timeout (in seconds) for UDP connections. Defaults to 30s if not set.
     * 
     */
    private final Integer udpIdleTimeoutSec;

    @CustomType.Constructor
    private RouterNatResponse(
        @CustomType.Parameter("drainNatIps") List<String> drainNatIps,
        @CustomType.Parameter("enableDynamicPortAllocation") Boolean enableDynamicPortAllocation,
        @CustomType.Parameter("enableEndpointIndependentMapping") Boolean enableEndpointIndependentMapping,
        @CustomType.Parameter("icmpIdleTimeoutSec") Integer icmpIdleTimeoutSec,
        @CustomType.Parameter("logConfig") RouterNatLogConfigResponse logConfig,
        @CustomType.Parameter("maxPortsPerVm") Integer maxPortsPerVm,
        @CustomType.Parameter("minPortsPerVm") Integer minPortsPerVm,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("natIpAllocateOption") String natIpAllocateOption,
        @CustomType.Parameter("natIps") List<String> natIps,
        @CustomType.Parameter("rules") List<RouterNatRuleResponse> rules,
        @CustomType.Parameter("sourceSubnetworkIpRangesToNat") String sourceSubnetworkIpRangesToNat,
        @CustomType.Parameter("subnetworks") List<RouterNatSubnetworkToNatResponse> subnetworks,
        @CustomType.Parameter("tcpEstablishedIdleTimeoutSec") Integer tcpEstablishedIdleTimeoutSec,
        @CustomType.Parameter("tcpTimeWaitTimeoutSec") Integer tcpTimeWaitTimeoutSec,
        @CustomType.Parameter("tcpTransitoryIdleTimeoutSec") Integer tcpTransitoryIdleTimeoutSec,
        @CustomType.Parameter("udpIdleTimeoutSec") Integer udpIdleTimeoutSec) {
        this.drainNatIps = drainNatIps;
        this.enableDynamicPortAllocation = enableDynamicPortAllocation;
        this.enableEndpointIndependentMapping = enableEndpointIndependentMapping;
        this.icmpIdleTimeoutSec = icmpIdleTimeoutSec;
        this.logConfig = logConfig;
        this.maxPortsPerVm = maxPortsPerVm;
        this.minPortsPerVm = minPortsPerVm;
        this.name = name;
        this.natIpAllocateOption = natIpAllocateOption;
        this.natIps = natIps;
        this.rules = rules;
        this.sourceSubnetworkIpRangesToNat = sourceSubnetworkIpRangesToNat;
        this.subnetworks = subnetworks;
        this.tcpEstablishedIdleTimeoutSec = tcpEstablishedIdleTimeoutSec;
        this.tcpTimeWaitTimeoutSec = tcpTimeWaitTimeoutSec;
        this.tcpTransitoryIdleTimeoutSec = tcpTransitoryIdleTimeoutSec;
        this.udpIdleTimeoutSec = udpIdleTimeoutSec;
    }

    /**
     * A list of URLs of the IP resources to be drained. These IPs must be valid static external IPs that have been assigned to the NAT. These IPs should be used for updating/patching a NAT only.
     * 
    */
    public List<String> drainNatIps() {
        return this.drainNatIps;
    }
    /**
     * Enable Dynamic Port Allocation. If not specified, it is disabled by default. If set to true, - Dynamic Port Allocation will be enabled on this NAT config. - enableEndpointIndependentMapping cannot be set to true. - If minPorts is set, minPortsPerVm must be set to a power of two greater than or equal to 32. If minPortsPerVm is not set, a minimum of 32 ports will be allocated to a VM from this NAT config.
     * 
    */
    public Boolean enableDynamicPortAllocation() {
        return this.enableDynamicPortAllocation;
    }
    public Boolean enableEndpointIndependentMapping() {
        return this.enableEndpointIndependentMapping;
    }
    /**
     * Timeout (in seconds) for ICMP connections. Defaults to 30s if not set.
     * 
    */
    public Integer icmpIdleTimeoutSec() {
        return this.icmpIdleTimeoutSec;
    }
    /**
     * Configure logging on this NAT.
     * 
    */
    public RouterNatLogConfigResponse logConfig() {
        return this.logConfig;
    }
    /**
     * Maximum number of ports allocated to a VM from this NAT config when Dynamic Port Allocation is enabled. If Dynamic Port Allocation is not enabled, this field has no effect. If Dynamic Port Allocation is enabled, and this field is set, it must be set to a power of two greater than minPortsPerVm, or 64 if minPortsPerVm is not set. If Dynamic Port Allocation is enabled and this field is not set, a maximum of 65536 ports will be allocated to a VM from this NAT config.
     * 
    */
    public Integer maxPortsPerVm() {
        return this.maxPortsPerVm;
    }
    /**
     * Minimum number of ports allocated to a VM from this NAT config. If not set, a default number of ports is allocated to a VM. This is rounded up to the nearest power of 2. For example, if the value of this field is 50, at least 64 ports are allocated to a VM.
     * 
    */
    public Integer minPortsPerVm() {
        return this.minPortsPerVm;
    }
    /**
     * Unique name of this Nat service. The name must be 1-63 characters long and comply with RFC1035.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * Specify the NatIpAllocateOption, which can take one of the following values: - MANUAL_ONLY: Uses only Nat IP addresses provided by customers. When there are not enough specified Nat IPs, the Nat service fails for new VMs. - AUTO_ONLY: Nat IPs are allocated by Google Cloud Platform; customers can&#39;t specify any Nat IPs. When choosing AUTO_ONLY, then nat_ip should be empty.
     * 
    */
    public String natIpAllocateOption() {
        return this.natIpAllocateOption;
    }
    /**
     * A list of URLs of the IP resources used for this Nat service. These IP addresses must be valid static external IP addresses assigned to the project.
     * 
    */
    public List<String> natIps() {
        return this.natIps;
    }
    /**
     * A list of rules associated with this NAT.
     * 
    */
    public List<RouterNatRuleResponse> rules() {
        return this.rules;
    }
    /**
     * Specify the Nat option, which can take one of the following values: - ALL_SUBNETWORKS_ALL_IP_RANGES: All of the IP ranges in every Subnetwork are allowed to Nat. - ALL_SUBNETWORKS_ALL_PRIMARY_IP_RANGES: All of the primary IP ranges in every Subnetwork are allowed to Nat. - LIST_OF_SUBNETWORKS: A list of Subnetworks are allowed to Nat (specified in the field subnetwork below) The default is SUBNETWORK_IP_RANGE_TO_NAT_OPTION_UNSPECIFIED. Note that if this field contains ALL_SUBNETWORKS_ALL_IP_RANGES or ALL_SUBNETWORKS_ALL_PRIMARY_IP_RANGES, then there should not be any other Router.Nat section in any Router for this network in this region.
     * 
    */
    public String sourceSubnetworkIpRangesToNat() {
        return this.sourceSubnetworkIpRangesToNat;
    }
    /**
     * A list of Subnetwork resources whose traffic should be translated by NAT Gateway. It is used only when LIST_OF_SUBNETWORKS is selected for the SubnetworkIpRangeToNatOption above.
     * 
    */
    public List<RouterNatSubnetworkToNatResponse> subnetworks() {
        return this.subnetworks;
    }
    /**
     * Timeout (in seconds) for TCP established connections. Defaults to 1200s if not set.
     * 
    */
    public Integer tcpEstablishedIdleTimeoutSec() {
        return this.tcpEstablishedIdleTimeoutSec;
    }
    /**
     * Timeout (in seconds) for TCP connections that are in TIME_WAIT state. Defaults to 120s if not set.
     * 
    */
    public Integer tcpTimeWaitTimeoutSec() {
        return this.tcpTimeWaitTimeoutSec;
    }
    /**
     * Timeout (in seconds) for TCP transitory connections. Defaults to 30s if not set.
     * 
    */
    public Integer tcpTransitoryIdleTimeoutSec() {
        return this.tcpTransitoryIdleTimeoutSec;
    }
    /**
     * Timeout (in seconds) for UDP connections. Defaults to 30s if not set.
     * 
    */
    public Integer udpIdleTimeoutSec() {
        return this.udpIdleTimeoutSec;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouterNatResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> drainNatIps;
        private Boolean enableDynamicPortAllocation;
        private Boolean enableEndpointIndependentMapping;
        private Integer icmpIdleTimeoutSec;
        private RouterNatLogConfigResponse logConfig;
        private Integer maxPortsPerVm;
        private Integer minPortsPerVm;
        private String name;
        private String natIpAllocateOption;
        private List<String> natIps;
        private List<RouterNatRuleResponse> rules;
        private String sourceSubnetworkIpRangesToNat;
        private List<RouterNatSubnetworkToNatResponse> subnetworks;
        private Integer tcpEstablishedIdleTimeoutSec;
        private Integer tcpTimeWaitTimeoutSec;
        private Integer tcpTransitoryIdleTimeoutSec;
        private Integer udpIdleTimeoutSec;

        public Builder() {
    	      // Empty
        }

        public Builder(RouterNatResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.drainNatIps = defaults.drainNatIps;
    	      this.enableDynamicPortAllocation = defaults.enableDynamicPortAllocation;
    	      this.enableEndpointIndependentMapping = defaults.enableEndpointIndependentMapping;
    	      this.icmpIdleTimeoutSec = defaults.icmpIdleTimeoutSec;
    	      this.logConfig = defaults.logConfig;
    	      this.maxPortsPerVm = defaults.maxPortsPerVm;
    	      this.minPortsPerVm = defaults.minPortsPerVm;
    	      this.name = defaults.name;
    	      this.natIpAllocateOption = defaults.natIpAllocateOption;
    	      this.natIps = defaults.natIps;
    	      this.rules = defaults.rules;
    	      this.sourceSubnetworkIpRangesToNat = defaults.sourceSubnetworkIpRangesToNat;
    	      this.subnetworks = defaults.subnetworks;
    	      this.tcpEstablishedIdleTimeoutSec = defaults.tcpEstablishedIdleTimeoutSec;
    	      this.tcpTimeWaitTimeoutSec = defaults.tcpTimeWaitTimeoutSec;
    	      this.tcpTransitoryIdleTimeoutSec = defaults.tcpTransitoryIdleTimeoutSec;
    	      this.udpIdleTimeoutSec = defaults.udpIdleTimeoutSec;
        }

        public Builder drainNatIps(List<String> drainNatIps) {
            this.drainNatIps = Objects.requireNonNull(drainNatIps);
            return this;
        }
        public Builder drainNatIps(String... drainNatIps) {
            return drainNatIps(List.of(drainNatIps));
        }
        public Builder enableDynamicPortAllocation(Boolean enableDynamicPortAllocation) {
            this.enableDynamicPortAllocation = Objects.requireNonNull(enableDynamicPortAllocation);
            return this;
        }
        public Builder enableEndpointIndependentMapping(Boolean enableEndpointIndependentMapping) {
            this.enableEndpointIndependentMapping = Objects.requireNonNull(enableEndpointIndependentMapping);
            return this;
        }
        public Builder icmpIdleTimeoutSec(Integer icmpIdleTimeoutSec) {
            this.icmpIdleTimeoutSec = Objects.requireNonNull(icmpIdleTimeoutSec);
            return this;
        }
        public Builder logConfig(RouterNatLogConfigResponse logConfig) {
            this.logConfig = Objects.requireNonNull(logConfig);
            return this;
        }
        public Builder maxPortsPerVm(Integer maxPortsPerVm) {
            this.maxPortsPerVm = Objects.requireNonNull(maxPortsPerVm);
            return this;
        }
        public Builder minPortsPerVm(Integer minPortsPerVm) {
            this.minPortsPerVm = Objects.requireNonNull(minPortsPerVm);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder natIpAllocateOption(String natIpAllocateOption) {
            this.natIpAllocateOption = Objects.requireNonNull(natIpAllocateOption);
            return this;
        }
        public Builder natIps(List<String> natIps) {
            this.natIps = Objects.requireNonNull(natIps);
            return this;
        }
        public Builder natIps(String... natIps) {
            return natIps(List.of(natIps));
        }
        public Builder rules(List<RouterNatRuleResponse> rules) {
            this.rules = Objects.requireNonNull(rules);
            return this;
        }
        public Builder rules(RouterNatRuleResponse... rules) {
            return rules(List.of(rules));
        }
        public Builder sourceSubnetworkIpRangesToNat(String sourceSubnetworkIpRangesToNat) {
            this.sourceSubnetworkIpRangesToNat = Objects.requireNonNull(sourceSubnetworkIpRangesToNat);
            return this;
        }
        public Builder subnetworks(List<RouterNatSubnetworkToNatResponse> subnetworks) {
            this.subnetworks = Objects.requireNonNull(subnetworks);
            return this;
        }
        public Builder subnetworks(RouterNatSubnetworkToNatResponse... subnetworks) {
            return subnetworks(List.of(subnetworks));
        }
        public Builder tcpEstablishedIdleTimeoutSec(Integer tcpEstablishedIdleTimeoutSec) {
            this.tcpEstablishedIdleTimeoutSec = Objects.requireNonNull(tcpEstablishedIdleTimeoutSec);
            return this;
        }
        public Builder tcpTimeWaitTimeoutSec(Integer tcpTimeWaitTimeoutSec) {
            this.tcpTimeWaitTimeoutSec = Objects.requireNonNull(tcpTimeWaitTimeoutSec);
            return this;
        }
        public Builder tcpTransitoryIdleTimeoutSec(Integer tcpTransitoryIdleTimeoutSec) {
            this.tcpTransitoryIdleTimeoutSec = Objects.requireNonNull(tcpTransitoryIdleTimeoutSec);
            return this;
        }
        public Builder udpIdleTimeoutSec(Integer udpIdleTimeoutSec) {
            this.udpIdleTimeoutSec = Objects.requireNonNull(udpIdleTimeoutSec);
            return this;
        }        public RouterNatResponse build() {
            return new RouterNatResponse(drainNatIps, enableDynamicPortAllocation, enableEndpointIndependentMapping, icmpIdleTimeoutSec, logConfig, maxPortsPerVm, minPortsPerVm, name, natIpAllocateOption, natIps, rules, sourceSubnetworkIpRangesToNat, subnetworks, tcpEstablishedIdleTimeoutSec, tcpTimeWaitTimeoutSec, tcpTransitoryIdleTimeoutSec, udpIdleTimeoutSec);
        }
    }
}
