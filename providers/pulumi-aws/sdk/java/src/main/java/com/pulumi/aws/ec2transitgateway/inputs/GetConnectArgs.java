// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2transitgateway.inputs;

import com.pulumi.aws.ec2transitgateway.inputs.GetConnectFilter;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetConnectArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetConnectArgs Empty = new GetConnectArgs();

    /**
     * One or more configuration blocks containing name-values filters. Detailed below.
     * 
     */
    @Import(name="filters")
    private @Nullable List<GetConnectFilter> filters;

    /**
     * @return One or more configuration blocks containing name-values filters. Detailed below.
     * 
     */
    public Optional<List<GetConnectFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * Key-value tags for the EC2 Transit Gateway Connect
     * 
     */
    @Import(name="tags")
    private @Nullable Map<String,String> tags;

    /**
     * @return Key-value tags for the EC2 Transit Gateway Connect
     * 
     */
    public Optional<Map<String,String>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * Identifier of the EC2 Transit Gateway Connect.
     * 
     */
    @Import(name="transitGatewayConnectId")
    private @Nullable String transitGatewayConnectId;

    /**
     * @return Identifier of the EC2 Transit Gateway Connect.
     * 
     */
    public Optional<String> transitGatewayConnectId() {
        return Optional.ofNullable(this.transitGatewayConnectId);
    }

    private GetConnectArgs() {}

    private GetConnectArgs(GetConnectArgs $) {
        this.filters = $.filters;
        this.tags = $.tags;
        this.transitGatewayConnectId = $.transitGatewayConnectId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetConnectArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetConnectArgs $;

        public Builder() {
            $ = new GetConnectArgs();
        }

        public Builder(GetConnectArgs defaults) {
            $ = new GetConnectArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param filters One or more configuration blocks containing name-values filters. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder filters(@Nullable List<GetConnectFilter> filters) {
            $.filters = filters;
            return this;
        }

        /**
         * @param filters One or more configuration blocks containing name-values filters. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder filters(GetConnectFilter... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param tags Key-value tags for the EC2 Transit Gateway Connect
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Map<String,String> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param transitGatewayConnectId Identifier of the EC2 Transit Gateway Connect.
         * 
         * @return builder
         * 
         */
        public Builder transitGatewayConnectId(@Nullable String transitGatewayConnectId) {
            $.transitGatewayConnectId = transitGatewayConnectId;
            return this;
        }

        public GetConnectArgs build() {
            return $;
        }
    }

}
