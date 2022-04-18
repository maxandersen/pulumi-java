// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.s3outposts.outputs;

import com.pulumi.awsnative.s3outposts.enums.EndpointStatus;
import com.pulumi.awsnative.s3outposts.outputs.EndpointNetworkInterface;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetEndpointResult {
    /**
     * The Amazon Resource Name (ARN) of the endpoint.
     * 
     */
    private final @Nullable String arn;
    /**
     * The VPC CIDR committed by this endpoint.
     * 
     */
    private final @Nullable String cidrBlock;
    /**
     * The time the endpoint was created.
     * 
     */
    private final @Nullable String creationTime;
    /**
     * The ID of the endpoint.
     * 
     */
    private final @Nullable String id;
    /**
     * The network interfaces of the endpoint.
     * 
     */
    private final @Nullable List<EndpointNetworkInterface> networkInterfaces;
    private final @Nullable EndpointStatus status;

    @CustomType.Constructor
    private GetEndpointResult(
        @CustomType.Parameter("arn") @Nullable String arn,
        @CustomType.Parameter("cidrBlock") @Nullable String cidrBlock,
        @CustomType.Parameter("creationTime") @Nullable String creationTime,
        @CustomType.Parameter("id") @Nullable String id,
        @CustomType.Parameter("networkInterfaces") @Nullable List<EndpointNetworkInterface> networkInterfaces,
        @CustomType.Parameter("status") @Nullable EndpointStatus status) {
        this.arn = arn;
        this.cidrBlock = cidrBlock;
        this.creationTime = creationTime;
        this.id = id;
        this.networkInterfaces = networkInterfaces;
        this.status = status;
    }

    /**
     * The Amazon Resource Name (ARN) of the endpoint.
     * 
    */
    public Optional<String> arn() {
        return Optional.ofNullable(this.arn);
    }
    /**
     * The VPC CIDR committed by this endpoint.
     * 
    */
    public Optional<String> cidrBlock() {
        return Optional.ofNullable(this.cidrBlock);
    }
    /**
     * The time the endpoint was created.
     * 
    */
    public Optional<String> creationTime() {
        return Optional.ofNullable(this.creationTime);
    }
    /**
     * The ID of the endpoint.
     * 
    */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * The network interfaces of the endpoint.
     * 
    */
    public List<EndpointNetworkInterface> networkInterfaces() {
        return this.networkInterfaces == null ? List.of() : this.networkInterfaces;
    }
    public Optional<EndpointStatus> status() {
        return Optional.ofNullable(this.status);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEndpointResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arn;
        private @Nullable String cidrBlock;
        private @Nullable String creationTime;
        private @Nullable String id;
        private @Nullable List<EndpointNetworkInterface> networkInterfaces;
        private @Nullable EndpointStatus status;

        public Builder() {
    	      // Empty
        }

        public Builder(GetEndpointResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.cidrBlock = defaults.cidrBlock;
    	      this.creationTime = defaults.creationTime;
    	      this.id = defaults.id;
    	      this.networkInterfaces = defaults.networkInterfaces;
    	      this.status = defaults.status;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }
        public Builder cidrBlock(@Nullable String cidrBlock) {
            this.cidrBlock = cidrBlock;
            return this;
        }
        public Builder creationTime(@Nullable String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        public Builder networkInterfaces(@Nullable List<EndpointNetworkInterface> networkInterfaces) {
            this.networkInterfaces = networkInterfaces;
            return this;
        }
        public Builder networkInterfaces(EndpointNetworkInterface... networkInterfaces) {
            return networkInterfaces(List.of(networkInterfaces));
        }
        public Builder status(@Nullable EndpointStatus status) {
            this.status = status;
            return this;
        }        public GetEndpointResult build() {
            return new GetEndpointResult(arn, cidrBlock, creationTime, id, networkInterfaces, status);
        }
    }
}
