// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.networkfirewall.outputs;

import com.pulumi.awsnative.networkfirewall.enums.RuleGroupHeaderDirection;
import com.pulumi.awsnative.networkfirewall.enums.RuleGroupHeaderProtocol;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class RuleGroupHeader {
    private final String destination;
    private final String destinationPort;
    private final RuleGroupHeaderDirection direction;
    private final RuleGroupHeaderProtocol protocol;
    private final String source;
    private final String sourcePort;

    @CustomType.Constructor
    private RuleGroupHeader(
        @CustomType.Parameter("destination") String destination,
        @CustomType.Parameter("destinationPort") String destinationPort,
        @CustomType.Parameter("direction") RuleGroupHeaderDirection direction,
        @CustomType.Parameter("protocol") RuleGroupHeaderProtocol protocol,
        @CustomType.Parameter("source") String source,
        @CustomType.Parameter("sourcePort") String sourcePort) {
        this.destination = destination;
        this.destinationPort = destinationPort;
        this.direction = direction;
        this.protocol = protocol;
        this.source = source;
        this.sourcePort = sourcePort;
    }

    public String destination() {
        return this.destination;
    }
    public String destinationPort() {
        return this.destinationPort;
    }
    public RuleGroupHeaderDirection direction() {
        return this.direction;
    }
    public RuleGroupHeaderProtocol protocol() {
        return this.protocol;
    }
    public String source() {
        return this.source;
    }
    public String sourcePort() {
        return this.sourcePort;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupHeader defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String destination;
        private String destinationPort;
        private RuleGroupHeaderDirection direction;
        private RuleGroupHeaderProtocol protocol;
        private String source;
        private String sourcePort;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupHeader defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destination = defaults.destination;
    	      this.destinationPort = defaults.destinationPort;
    	      this.direction = defaults.direction;
    	      this.protocol = defaults.protocol;
    	      this.source = defaults.source;
    	      this.sourcePort = defaults.sourcePort;
        }

        public Builder destination(String destination) {
            this.destination = Objects.requireNonNull(destination);
            return this;
        }
        public Builder destinationPort(String destinationPort) {
            this.destinationPort = Objects.requireNonNull(destinationPort);
            return this;
        }
        public Builder direction(RuleGroupHeaderDirection direction) {
            this.direction = Objects.requireNonNull(direction);
            return this;
        }
        public Builder protocol(RuleGroupHeaderProtocol protocol) {
            this.protocol = Objects.requireNonNull(protocol);
            return this;
        }
        public Builder source(String source) {
            this.source = Objects.requireNonNull(source);
            return this;
        }
        public Builder sourcePort(String sourcePort) {
            this.sourcePort = Objects.requireNonNull(sourcePort);
            return this;
        }        public RuleGroupHeader build() {
            return new RuleGroupHeader(destination, destinationPort, direction, protocol, source, sourcePort);
        }
    }
}
