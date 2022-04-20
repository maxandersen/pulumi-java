// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.healthcare_v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.healthcare_v1beta1.outputs.SchemaPackageResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ParserConfigResponse {
    /**
     * Determines whether messages with no header are allowed.
     * 
     */
    private final Boolean allowNullHeader;
    /**
     * Schemas used to parse messages in this store, if schematized parsing is desired.
     * 
     */
    private final SchemaPackageResponse schema;
    /**
     * Byte(s) to use as the segment terminator. If this is unset, &#39;\r&#39; is used as segment terminator, matching the HL7 version 2 specification.
     * 
     */
    private final String segmentTerminator;
    /**
     * Immutable. Determines the version of both the default parser to be used when `schema` is not given, as well as the schematized parser used when `schema` is specified. This field is immutable after HL7v2 store creation.
     * 
     */
    private final String version;

    @CustomType.Constructor
    private ParserConfigResponse(
        @CustomType.Parameter("allowNullHeader") Boolean allowNullHeader,
        @CustomType.Parameter("schema") SchemaPackageResponse schema,
        @CustomType.Parameter("segmentTerminator") String segmentTerminator,
        @CustomType.Parameter("version") String version) {
        this.allowNullHeader = allowNullHeader;
        this.schema = schema;
        this.segmentTerminator = segmentTerminator;
        this.version = version;
    }

    /**
     * Determines whether messages with no header are allowed.
     * 
    */
    public Boolean allowNullHeader() {
        return this.allowNullHeader;
    }
    /**
     * Schemas used to parse messages in this store, if schematized parsing is desired.
     * 
    */
    public SchemaPackageResponse schema() {
        return this.schema;
    }
    /**
     * Byte(s) to use as the segment terminator. If this is unset, &#39;\r&#39; is used as segment terminator, matching the HL7 version 2 specification.
     * 
    */
    public String segmentTerminator() {
        return this.segmentTerminator;
    }
    /**
     * Immutable. Determines the version of both the default parser to be used when `schema` is not given, as well as the schematized parser used when `schema` is specified. This field is immutable after HL7v2 store creation.
     * 
    */
    public String version() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ParserConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean allowNullHeader;
        private SchemaPackageResponse schema;
        private String segmentTerminator;
        private String version;

        public Builder() {
    	      // Empty
        }

        public Builder(ParserConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowNullHeader = defaults.allowNullHeader;
    	      this.schema = defaults.schema;
    	      this.segmentTerminator = defaults.segmentTerminator;
    	      this.version = defaults.version;
        }

        public Builder allowNullHeader(Boolean allowNullHeader) {
            this.allowNullHeader = Objects.requireNonNull(allowNullHeader);
            return this;
        }
        public Builder schema(SchemaPackageResponse schema) {
            this.schema = Objects.requireNonNull(schema);
            return this;
        }
        public Builder segmentTerminator(String segmentTerminator) {
            this.segmentTerminator = Objects.requireNonNull(segmentTerminator);
            return this;
        }
        public Builder version(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }        public ParserConfigResponse build() {
            return new ParserConfigResponse(allowNullHeader, schema, segmentTerminator, version);
        }
    }
}
