// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.outputs;

import com.pulumi.aws.ec2.outputs.GetElasticIpFilter;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetElasticIpResult {
    /**
     * The ID representing the association of the address with an instance in a VPC.
     * 
     */
    private final String associationId;
    /**
     * The carrier IP address.
     * 
     */
    private final String carrierIp;
    /**
     * Customer Owned IP.
     * 
     */
    private final String customerOwnedIp;
    /**
     * The ID of a Customer Owned IP Pool. For more on customer owned IP addressed check out [Customer-owned IP addresses guide](https://docs.aws.amazon.com/outposts/latest/userguide/outposts-networking-components.html#ip-addressing)
     * 
     */
    private final String customerOwnedIpv4Pool;
    /**
     * Indicates whether the address is for use in EC2-Classic (standard) or in a VPC (vpc).
     * 
     */
    private final String domain;
    private final @Nullable List<GetElasticIpFilter> filters;
    /**
     * If VPC Elastic IP, the allocation identifier. If EC2-Classic Elastic IP, the public IP address.
     * 
     */
    private final String id;
    /**
     * The ID of the instance that the address is associated with (if any).
     * 
     */
    private final String instanceId;
    /**
     * The ID of the network interface.
     * 
     */
    private final String networkInterfaceId;
    /**
     * The ID of the AWS account that owns the network interface.
     * 
     */
    private final String networkInterfaceOwnerId;
    /**
     * The Private DNS associated with the Elastic IP address.
     * 
     */
    private final String privateDns;
    /**
     * The private IP address associated with the Elastic IP address.
     * 
     */
    private final String privateIp;
    /**
     * Public DNS associated with the Elastic IP address.
     * 
     */
    private final String publicDns;
    /**
     * Public IP address of Elastic IP.
     * 
     */
    private final String publicIp;
    /**
     * The ID of an address pool.
     * 
     */
    private final String publicIpv4Pool;
    /**
     * Key-value map of tags associated with Elastic IP.
     * 
     */
    private final Map<String,String> tags;

    @CustomType.Constructor
    private GetElasticIpResult(
        @CustomType.Parameter("associationId") String associationId,
        @CustomType.Parameter("carrierIp") String carrierIp,
        @CustomType.Parameter("customerOwnedIp") String customerOwnedIp,
        @CustomType.Parameter("customerOwnedIpv4Pool") String customerOwnedIpv4Pool,
        @CustomType.Parameter("domain") String domain,
        @CustomType.Parameter("filters") @Nullable List<GetElasticIpFilter> filters,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("instanceId") String instanceId,
        @CustomType.Parameter("networkInterfaceId") String networkInterfaceId,
        @CustomType.Parameter("networkInterfaceOwnerId") String networkInterfaceOwnerId,
        @CustomType.Parameter("privateDns") String privateDns,
        @CustomType.Parameter("privateIp") String privateIp,
        @CustomType.Parameter("publicDns") String publicDns,
        @CustomType.Parameter("publicIp") String publicIp,
        @CustomType.Parameter("publicIpv4Pool") String publicIpv4Pool,
        @CustomType.Parameter("tags") Map<String,String> tags) {
        this.associationId = associationId;
        this.carrierIp = carrierIp;
        this.customerOwnedIp = customerOwnedIp;
        this.customerOwnedIpv4Pool = customerOwnedIpv4Pool;
        this.domain = domain;
        this.filters = filters;
        this.id = id;
        this.instanceId = instanceId;
        this.networkInterfaceId = networkInterfaceId;
        this.networkInterfaceOwnerId = networkInterfaceOwnerId;
        this.privateDns = privateDns;
        this.privateIp = privateIp;
        this.publicDns = publicDns;
        this.publicIp = publicIp;
        this.publicIpv4Pool = publicIpv4Pool;
        this.tags = tags;
    }

    /**
     * The ID representing the association of the address with an instance in a VPC.
     * 
    */
    public String associationId() {
        return this.associationId;
    }
    /**
     * The carrier IP address.
     * 
    */
    public String carrierIp() {
        return this.carrierIp;
    }
    /**
     * Customer Owned IP.
     * 
    */
    public String customerOwnedIp() {
        return this.customerOwnedIp;
    }
    /**
     * The ID of a Customer Owned IP Pool. For more on customer owned IP addressed check out [Customer-owned IP addresses guide](https://docs.aws.amazon.com/outposts/latest/userguide/outposts-networking-components.html#ip-addressing)
     * 
    */
    public String customerOwnedIpv4Pool() {
        return this.customerOwnedIpv4Pool;
    }
    /**
     * Indicates whether the address is for use in EC2-Classic (standard) or in a VPC (vpc).
     * 
    */
    public String domain() {
        return this.domain;
    }
    public List<GetElasticIpFilter> filters() {
        return this.filters == null ? List.of() : this.filters;
    }
    /**
     * If VPC Elastic IP, the allocation identifier. If EC2-Classic Elastic IP, the public IP address.
     * 
    */
    public String id() {
        return this.id;
    }
    /**
     * The ID of the instance that the address is associated with (if any).
     * 
    */
    public String instanceId() {
        return this.instanceId;
    }
    /**
     * The ID of the network interface.
     * 
    */
    public String networkInterfaceId() {
        return this.networkInterfaceId;
    }
    /**
     * The ID of the AWS account that owns the network interface.
     * 
    */
    public String networkInterfaceOwnerId() {
        return this.networkInterfaceOwnerId;
    }
    /**
     * The Private DNS associated with the Elastic IP address.
     * 
    */
    public String privateDns() {
        return this.privateDns;
    }
    /**
     * The private IP address associated with the Elastic IP address.
     * 
    */
    public String privateIp() {
        return this.privateIp;
    }
    /**
     * Public DNS associated with the Elastic IP address.
     * 
    */
    public String publicDns() {
        return this.publicDns;
    }
    /**
     * Public IP address of Elastic IP.
     * 
    */
    public String publicIp() {
        return this.publicIp;
    }
    /**
     * The ID of an address pool.
     * 
    */
    public String publicIpv4Pool() {
        return this.publicIpv4Pool;
    }
    /**
     * Key-value map of tags associated with Elastic IP.
     * 
    */
    public Map<String,String> tags() {
        return this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetElasticIpResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String associationId;
        private String carrierIp;
        private String customerOwnedIp;
        private String customerOwnedIpv4Pool;
        private String domain;
        private @Nullable List<GetElasticIpFilter> filters;
        private String id;
        private String instanceId;
        private String networkInterfaceId;
        private String networkInterfaceOwnerId;
        private String privateDns;
        private String privateIp;
        private String publicDns;
        private String publicIp;
        private String publicIpv4Pool;
        private Map<String,String> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetElasticIpResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.associationId = defaults.associationId;
    	      this.carrierIp = defaults.carrierIp;
    	      this.customerOwnedIp = defaults.customerOwnedIp;
    	      this.customerOwnedIpv4Pool = defaults.customerOwnedIpv4Pool;
    	      this.domain = defaults.domain;
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.instanceId = defaults.instanceId;
    	      this.networkInterfaceId = defaults.networkInterfaceId;
    	      this.networkInterfaceOwnerId = defaults.networkInterfaceOwnerId;
    	      this.privateDns = defaults.privateDns;
    	      this.privateIp = defaults.privateIp;
    	      this.publicDns = defaults.publicDns;
    	      this.publicIp = defaults.publicIp;
    	      this.publicIpv4Pool = defaults.publicIpv4Pool;
    	      this.tags = defaults.tags;
        }

        public Builder associationId(String associationId) {
            this.associationId = Objects.requireNonNull(associationId);
            return this;
        }
        public Builder carrierIp(String carrierIp) {
            this.carrierIp = Objects.requireNonNull(carrierIp);
            return this;
        }
        public Builder customerOwnedIp(String customerOwnedIp) {
            this.customerOwnedIp = Objects.requireNonNull(customerOwnedIp);
            return this;
        }
        public Builder customerOwnedIpv4Pool(String customerOwnedIpv4Pool) {
            this.customerOwnedIpv4Pool = Objects.requireNonNull(customerOwnedIpv4Pool);
            return this;
        }
        public Builder domain(String domain) {
            this.domain = Objects.requireNonNull(domain);
            return this;
        }
        public Builder filters(@Nullable List<GetElasticIpFilter> filters) {
            this.filters = filters;
            return this;
        }
        public Builder filters(GetElasticIpFilter... filters) {
            return filters(List.of(filters));
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder instanceId(String instanceId) {
            this.instanceId = Objects.requireNonNull(instanceId);
            return this;
        }
        public Builder networkInterfaceId(String networkInterfaceId) {
            this.networkInterfaceId = Objects.requireNonNull(networkInterfaceId);
            return this;
        }
        public Builder networkInterfaceOwnerId(String networkInterfaceOwnerId) {
            this.networkInterfaceOwnerId = Objects.requireNonNull(networkInterfaceOwnerId);
            return this;
        }
        public Builder privateDns(String privateDns) {
            this.privateDns = Objects.requireNonNull(privateDns);
            return this;
        }
        public Builder privateIp(String privateIp) {
            this.privateIp = Objects.requireNonNull(privateIp);
            return this;
        }
        public Builder publicDns(String publicDns) {
            this.publicDns = Objects.requireNonNull(publicDns);
            return this;
        }
        public Builder publicIp(String publicIp) {
            this.publicIp = Objects.requireNonNull(publicIp);
            return this;
        }
        public Builder publicIpv4Pool(String publicIpv4Pool) {
            this.publicIpv4Pool = Objects.requireNonNull(publicIpv4Pool);
            return this;
        }
        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }        public GetElasticIpResult build() {
            return new GetElasticIpResult(associationId, carrierIp, customerOwnedIp, customerOwnedIpv4Pool, domain, filters, id, instanceId, networkInterfaceId, networkInterfaceOwnerId, privateDns, privateIp, publicDns, publicIp, publicIpv4Pool, tags);
        }
    }
}
