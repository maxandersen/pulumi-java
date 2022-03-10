// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.healthcare_v1beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
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
     * The name of the field. For example, "PID-1" or just "1".
     * 
     */
    private final String name;
    /**
     * The HL7v2 table this field refers to. For example, PID-15 (Patient's Primary Language) usually refers to table "0296".
     * 
     */
    private final String table;
    /**
     * The type of this field. A Type with this name must be defined in an Hl7TypesConfig.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor
    private FieldResponse(
        @OutputCustomType.Parameter("maxOccurs") Integer maxOccurs,
        @OutputCustomType.Parameter("minOccurs") Integer minOccurs,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("table") String table,
        @OutputCustomType.Parameter("type") String type) {
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
    public Integer getMaxOccurs() {
        return this.maxOccurs;
    }
    /**
     * The minimum number of times this field must be present/repeated.
     * 
    */
    public Integer getMinOccurs() {
        return this.minOccurs;
    }
    /**
     * The name of the field. For example, "PID-1" or just "1".
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The HL7v2 table this field refers to. For example, PID-15 (Patient's Primary Language) usually refers to table "0296".
     * 
    */
    public String getTable() {
        return this.table;
    }
    /**
     * The type of this field. A Type with this name must be defined in an Hl7TypesConfig.
     * 
    */
    public String getType() {
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

        public Builder setMaxOccurs(Integer maxOccurs) {
            this.maxOccurs = Objects.requireNonNull(maxOccurs);
            return this;
        }

        public Builder setMinOccurs(Integer minOccurs) {
            this.minOccurs = Objects.requireNonNull(minOccurs);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setTable(String table) {
            this.table = Objects.requireNonNull(table);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public FieldResponse build() {
            return new FieldResponse(maxOccurs, minOccurs, name, table, type);
        }
    }
}
