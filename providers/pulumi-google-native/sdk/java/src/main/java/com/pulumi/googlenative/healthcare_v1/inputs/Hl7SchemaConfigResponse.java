// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.healthcare_v1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.healthcare_v1.inputs.VersionSourceResponse;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;


/**
 * Root config message for HL7v2 schema. This contains a schema structure of groups and segments, and filters that determine which messages to apply the schema structure to.
 * 
 */
public final class Hl7SchemaConfigResponse extends com.pulumi.resources.InvokeArgs {

    public static final Hl7SchemaConfigResponse Empty = new Hl7SchemaConfigResponse();

    /**
     * Map from each HL7v2 message type and trigger event pair, such as ADT_A04, to its schema configuration root group.
     * 
     */
    @Import(name="messageSchemaConfigs", required=true)
      private final Map<String,String> messageSchemaConfigs;

    public Map<String,String> messageSchemaConfigs() {
        return this.messageSchemaConfigs;
    }

    /**
     * Each VersionSource is tested and only if they all match is the schema used for the message.
     * 
     */
    @Import(name="version", required=true)
      private final List<VersionSourceResponse> version;

    public List<VersionSourceResponse> version() {
        return this.version;
    }

    public Hl7SchemaConfigResponse(
        Map<String,String> messageSchemaConfigs,
        List<VersionSourceResponse> version) {
        this.messageSchemaConfigs = Objects.requireNonNull(messageSchemaConfigs, "expected parameter 'messageSchemaConfigs' to be non-null");
        this.version = Objects.requireNonNull(version, "expected parameter 'version' to be non-null");
    }

    private Hl7SchemaConfigResponse() {
        this.messageSchemaConfigs = Map.of();
        this.version = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(Hl7SchemaConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,String> messageSchemaConfigs;
        private List<VersionSourceResponse> version;

        public Builder() {
    	      // Empty
        }

        public Builder(Hl7SchemaConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.messageSchemaConfigs = defaults.messageSchemaConfigs;
    	      this.version = defaults.version;
        }

        public Builder messageSchemaConfigs(Map<String,String> messageSchemaConfigs) {
            this.messageSchemaConfigs = Objects.requireNonNull(messageSchemaConfigs);
            return this;
        }
        public Builder version(List<VersionSourceResponse> version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }
        public Builder version(VersionSourceResponse... version) {
            return version(List.of(version));
        }        public Hl7SchemaConfigResponse build() {
            return new Hl7SchemaConfigResponse(messageSchemaConfigs, version);
        }
    }
}
