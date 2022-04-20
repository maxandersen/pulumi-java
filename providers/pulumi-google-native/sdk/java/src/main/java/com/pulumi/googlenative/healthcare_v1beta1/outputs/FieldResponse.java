// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.healthcare_v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class FieldResponse {
    /**
     * The maximum number of times this field can be repeated. 0 or -1 means unbounded.
     * 
     */
    private final Integer maxOccurs;
    /**
     * The minimum number of times this field must be present/repeated.
     * 
     */
    private final Integer minOccurs;
    /**
     * The name of the field. For example, &#34;PID-1&#34; or just &#34;1&#34;.
     * 
     */
    private final String name;
    /**
     * The HL7v2 table this field refers to. For example, PID-15 (Patient&#39;s Primary Language) usually refers to table &#34;0296&#34;.
     * 
     */
    private final String table;
    /**
     * The type of this field. A Type with this name must be defined in an Hl7TypesConfig.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private FieldResponse(
        @CustomType.Parameter("maxOccurs") Integer maxOccurs,
        @CustomType.Parameter("minOccurs") Integer minOccurs,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("table") String table,
        @CustomType.Parameter("type") String type) {
        this.maxOccurs = maxOccurs;
        this.minOccurs = minOccurs;
        this.name = name;
        this.table = table;
        this.type = type;
    }

    /**
     * The maximum number of times this field can be repeated. 0 or -1 means unbounded.
     * 
    */
    public Integer maxOccurs() {
        return this.maxOccurs;
    }
    /**
     * The minimum number of times this field must be present/repeated.
     * 
    */
    public Integer minOccurs() {
        return this.minOccurs;
    }
    /**
     * The name of the field. For example, &#34;PID-1&#34; or just &#34;1&#34;.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * The HL7v2 table this field refers to. For example, PID-15 (Patient&#39;s Primary Language) usually refers to table &#34;0296&#34;.
     * 
    */
    public String table() {
        return this.table;
    }
    /**
     * The type of this field. A Type with this name must be defined in an Hl7TypesConfig.
     * 
    */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FieldResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer maxOccurs;
        private Integer minOccurs;
        private String name;
        private String table;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(FieldResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxOccurs = defaults.maxOccurs;
    	      this.minOccurs = defaults.minOccurs;
    	      this.name = defaults.name;
    	      this.table = defaults.table;
    	      this.type = defaults.type;
        }

        public Builder maxOccurs(Integer maxOccurs) {
            this.maxOccurs = Objects.requireNonNull(maxOccurs);
            return this;
        }
        public Builder minOccurs(Integer minOccurs) {
            this.minOccurs = Objects.requireNonNull(minOccurs);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder table(String table) {
            this.table = Objects.requireNonNull(table);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public FieldResponse build() {
            return new FieldResponse(maxOccurs, minOccurs, name, table, type);
        }
    }
}
