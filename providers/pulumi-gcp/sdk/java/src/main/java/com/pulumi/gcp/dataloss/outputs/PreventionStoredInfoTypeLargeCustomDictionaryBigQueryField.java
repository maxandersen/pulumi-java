// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataloss.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.dataloss.outputs.PreventionStoredInfoTypeLargeCustomDictionaryBigQueryFieldField;
import com.pulumi.gcp.dataloss.outputs.PreventionStoredInfoTypeLargeCustomDictionaryBigQueryFieldTable;
import java.util.Objects;

@CustomType
public final class PreventionStoredInfoTypeLargeCustomDictionaryBigQueryField {
    /**
     * @return Designated field in the BigQuery table.
     * Structure is documented below.
     * 
     */
    private final PreventionStoredInfoTypeLargeCustomDictionaryBigQueryFieldField field;
    /**
     * @return Field in a BigQuery table where each cell represents a dictionary phrase.
     * Structure is documented below.
     * 
     */
    private final PreventionStoredInfoTypeLargeCustomDictionaryBigQueryFieldTable table;

    @CustomType.Constructor
    private PreventionStoredInfoTypeLargeCustomDictionaryBigQueryField(
        @CustomType.Parameter("field") PreventionStoredInfoTypeLargeCustomDictionaryBigQueryFieldField field,
        @CustomType.Parameter("table") PreventionStoredInfoTypeLargeCustomDictionaryBigQueryFieldTable table) {
        this.field = field;
        this.table = table;
    }

    /**
     * @return Designated field in the BigQuery table.
     * Structure is documented below.
     * 
     */
    public PreventionStoredInfoTypeLargeCustomDictionaryBigQueryFieldField field() {
        return this.field;
    }
    /**
     * @return Field in a BigQuery table where each cell represents a dictionary phrase.
     * Structure is documented below.
     * 
     */
    public PreventionStoredInfoTypeLargeCustomDictionaryBigQueryFieldTable table() {
        return this.table;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreventionStoredInfoTypeLargeCustomDictionaryBigQueryField defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PreventionStoredInfoTypeLargeCustomDictionaryBigQueryFieldField field;
        private PreventionStoredInfoTypeLargeCustomDictionaryBigQueryFieldTable table;

        public Builder() {
    	      // Empty
        }

        public Builder(PreventionStoredInfoTypeLargeCustomDictionaryBigQueryField defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.field = defaults.field;
    	      this.table = defaults.table;
        }

        public Builder field(PreventionStoredInfoTypeLargeCustomDictionaryBigQueryFieldField field) {
            this.field = Objects.requireNonNull(field);
            return this;
        }
        public Builder table(PreventionStoredInfoTypeLargeCustomDictionaryBigQueryFieldTable table) {
            this.table = Objects.requireNonNull(table);
            return this;
        }        public PreventionStoredInfoTypeLargeCustomDictionaryBigQueryField build() {
            return new PreventionStoredInfoTypeLargeCustomDictionaryBigQueryField(field, table);
        }
    }
}
