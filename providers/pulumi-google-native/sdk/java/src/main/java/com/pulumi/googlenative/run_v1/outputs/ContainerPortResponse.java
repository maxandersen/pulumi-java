// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.run_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ContainerPortResponse {
    /**
     * (Optional) Port number the container listens on. This must be a valid port number, 0 &lt; x &lt; 65536.
     * 
     */
    private final Integer containerPort;
    /**
     * (Optional) If specified, used to specify which protocol to use. Allowed values are &#34;http1&#34; and &#34;h2c&#34;.
     * 
     */
    private final String name;
    /**
     * (Optional) Protocol for port. Must be &#34;TCP&#34;. Defaults to &#34;TCP&#34;.
     * 
     */
    private final String protocol;

    @CustomType.Constructor
    private ContainerPortResponse(
        @CustomType.Parameter("containerPort") Integer containerPort,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("protocol") String protocol) {
        this.containerPort = containerPort;
        this.name = name;
        this.protocol = protocol;
    }

    /**
     * (Optional) Port number the container listens on. This must be a valid port number, 0 &lt; x &lt; 65536.
     * 
    */
    public Integer containerPort() {
        return this.containerPort;
    }
    /**
     * (Optional) If specified, used to specify which protocol to use. Allowed values are &#34;http1&#34; and &#34;h2c&#34;.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * (Optional) Protocol for port. Must be &#34;TCP&#34;. Defaults to &#34;TCP&#34;.
     * 
    */
    public String protocol() {
        return this.protocol;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerPortResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer containerPort;
        private String name;
        private String protocol;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerPortResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containerPort = defaults.containerPort;
    	      this.name = defaults.name;
    	      this.protocol = defaults.protocol;
        }

        public Builder containerPort(Integer containerPort) {
            this.containerPort = Objects.requireNonNull(containerPort);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder protocol(String protocol) {
            this.protocol = Objects.requireNonNull(protocol);
            return this;
        }        public ContainerPortResponse build() {
            return new ContainerPortResponse(containerPort, name, protocol);
        }
    }
}
