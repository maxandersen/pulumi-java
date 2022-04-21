// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.orbital.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Customer End point to store/retrieve data during a contact.
 * 
 */
public final class EndPointResponse extends com.pulumi.resources.InvokeArgs {

    public static final EndPointResponse Empty = new EndPointResponse();

    /**
     * Name of an end point.
     * 
     */
    @Import(name="endPointName", required=true)
    private String endPointName;

    public String endPointName() {
        return this.endPointName;
    }

    /**
     * IP Address.
     * 
     */
    @Import(name="ipAddress", required=true)
    private String ipAddress;

    public String ipAddress() {
        return this.ipAddress;
    }

    /**
     * TCP port to listen on to receive data.
     * 
     */
    @Import(name="port", required=true)
    private String port;

    public String port() {
        return this.port;
    }

    /**
     * Protocol either UDP or TCP.
     * 
     */
    @Import(name="protocol", required=true)
    private String protocol;

    public String protocol() {
        return this.protocol;
    }

    private EndPointResponse() {}

    private EndPointResponse(EndPointResponse $) {
        this.endPointName = $.endPointName;
        this.ipAddress = $.ipAddress;
        this.port = $.port;
        this.protocol = $.protocol;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EndPointResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EndPointResponse $;

        public Builder() {
            $ = new EndPointResponse();
        }

        public Builder(EndPointResponse defaults) {
            $ = new EndPointResponse(Objects.requireNonNull(defaults));
        }

        public Builder endPointName(String endPointName) {
            $.endPointName = endPointName;
            return this;
        }

        public Builder ipAddress(String ipAddress) {
            $.ipAddress = ipAddress;
            return this;
        }

        public Builder port(String port) {
            $.port = port;
            return this;
        }

        public Builder protocol(String protocol) {
            $.protocol = protocol;
            return this;
        }

        public EndPointResponse build() {
            $.endPointName = Objects.requireNonNull($.endPointName, "expected parameter 'endPointName' to be non-null");
            $.ipAddress = Objects.requireNonNull($.ipAddress, "expected parameter 'ipAddress' to be non-null");
            $.port = Objects.requireNonNull($.port, "expected parameter 'port' to be non-null");
            $.protocol = Objects.requireNonNull($.protocol, "expected parameter 'protocol' to be non-null");
            return $;
        }
    }

}
