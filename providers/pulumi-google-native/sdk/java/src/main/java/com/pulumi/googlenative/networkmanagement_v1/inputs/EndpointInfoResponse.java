// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.networkmanagement_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * For display only. The specification of the endpoints for the test. EndpointInfo is derived from source and destination Endpoint and validated by the backend data plane model.
 * 
 */
public final class EndpointInfoResponse extends com.pulumi.resources.InvokeArgs {

    public static final EndpointInfoResponse Empty = new EndpointInfoResponse();

    /**
     * Destination IP address.
     * 
     */
    @Import(name="destinationIp", required=true)
    private String destinationIp;

    public String destinationIp() {
        return this.destinationIp;
    }

    /**
     * URI of the network where this packet is sent to.
     * 
     */
    @Import(name="destinationNetworkUri", required=true)
    private String destinationNetworkUri;

    public String destinationNetworkUri() {
        return this.destinationNetworkUri;
    }

    /**
     * Destination port. Only valid when protocol is TCP or UDP.
     * 
     */
    @Import(name="destinationPort", required=true)
    private Integer destinationPort;

    public Integer destinationPort() {
        return this.destinationPort;
    }

    /**
     * IP protocol in string format, for example: &#34;TCP&#34;, &#34;UDP&#34;, &#34;ICMP&#34;.
     * 
     */
    @Import(name="protocol", required=true)
    private String protocol;

    public String protocol() {
        return this.protocol;
    }

    /**
     * Source IP address.
     * 
     */
    @Import(name="sourceIp", required=true)
    private String sourceIp;

    public String sourceIp() {
        return this.sourceIp;
    }

    /**
     * URI of the network where this packet originates from.
     * 
     */
    @Import(name="sourceNetworkUri", required=true)
    private String sourceNetworkUri;

    public String sourceNetworkUri() {
        return this.sourceNetworkUri;
    }

    /**
     * Source port. Only valid when protocol is TCP or UDP.
     * 
     */
    @Import(name="sourcePort", required=true)
    private Integer sourcePort;

    public Integer sourcePort() {
        return this.sourcePort;
    }

    private EndpointInfoResponse() {}

    private EndpointInfoResponse(EndpointInfoResponse $) {
        this.destinationIp = $.destinationIp;
        this.destinationNetworkUri = $.destinationNetworkUri;
        this.destinationPort = $.destinationPort;
        this.protocol = $.protocol;
        this.sourceIp = $.sourceIp;
        this.sourceNetworkUri = $.sourceNetworkUri;
        this.sourcePort = $.sourcePort;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EndpointInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EndpointInfoResponse $;

        public Builder() {
            $ = new EndpointInfoResponse();
        }

        public Builder(EndpointInfoResponse defaults) {
            $ = new EndpointInfoResponse(Objects.requireNonNull(defaults));
        }

        public Builder destinationIp(String destinationIp) {
            $.destinationIp = destinationIp;
            return this;
        }

        public Builder destinationNetworkUri(String destinationNetworkUri) {
            $.destinationNetworkUri = destinationNetworkUri;
            return this;
        }

        public Builder destinationPort(Integer destinationPort) {
            $.destinationPort = destinationPort;
            return this;
        }

        public Builder protocol(String protocol) {
            $.protocol = protocol;
            return this;
        }

        public Builder sourceIp(String sourceIp) {
            $.sourceIp = sourceIp;
            return this;
        }

        public Builder sourceNetworkUri(String sourceNetworkUri) {
            $.sourceNetworkUri = sourceNetworkUri;
            return this;
        }

        public Builder sourcePort(Integer sourcePort) {
            $.sourcePort = sourcePort;
            return this;
        }

        public EndpointInfoResponse build() {
            $.destinationIp = Objects.requireNonNull($.destinationIp, "expected parameter 'destinationIp' to be non-null");
            $.destinationNetworkUri = Objects.requireNonNull($.destinationNetworkUri, "expected parameter 'destinationNetworkUri' to be non-null");
            $.destinationPort = Objects.requireNonNull($.destinationPort, "expected parameter 'destinationPort' to be non-null");
            $.protocol = Objects.requireNonNull($.protocol, "expected parameter 'protocol' to be non-null");
            $.sourceIp = Objects.requireNonNull($.sourceIp, "expected parameter 'sourceIp' to be non-null");
            $.sourceNetworkUri = Objects.requireNonNull($.sourceNetworkUri, "expected parameter 'sourceNetworkUri' to be non-null");
            $.sourcePort = Objects.requireNonNull($.sourcePort, "expected parameter 'sourcePort' to be non-null");
            return $;
        }
    }

}
