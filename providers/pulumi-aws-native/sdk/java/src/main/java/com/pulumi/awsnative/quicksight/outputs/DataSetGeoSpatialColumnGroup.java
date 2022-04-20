// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.quicksight.outputs;

import com.pulumi.awsnative.quicksight.enums.DataSetGeoSpatialCountryCode;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DataSetGeoSpatialColumnGroup {
    /**
     * &lt;p&gt;Columns in this hierarchy.&lt;/p&gt;
     * 
     */
    private final List<String> columns;
    private final @Nullable DataSetGeoSpatialCountryCode countryCode;
    /**
     * &lt;p&gt;A display name for the hierarchy.&lt;/p&gt;
     * 
     */
    private final String name;

    @CustomType.Constructor
    private DataSetGeoSpatialColumnGroup(
        @CustomType.Parameter("columns") List<String> columns,
        @CustomType.Parameter("countryCode") @Nullable DataSetGeoSpatialCountryCode countryCode,
        @CustomType.Parameter("name") String name) {
        this.columns = columns;
        this.countryCode = countryCode;
        this.name = name;
    }

    /**
     * &lt;p&gt;Columns in this hierarchy.&lt;/p&gt;
     * 
    */
    public List<String> columns() {
        return this.columns;
    }
    public Optional<DataSetGeoSpatialCountryCode> countryCode() {
        return Optional.ofNullable(this.countryCode);
    }
    /**
     * &lt;p&gt;A display name for the hierarchy.&lt;/p&gt;
     * 
    */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSetGeoSpatialColumnGroup defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> columns;
        private @Nullable DataSetGeoSpatialCountryCode countryCode;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSetGeoSpatialColumnGroup defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.columns = defaults.columns;
    	      this.countryCode = defaults.countryCode;
    	      this.name = defaults.name;
        }

        public Builder columns(List<String> columns) {
            this.columns = Objects.requireNonNull(columns);
            return this;
        }
        public Builder columns(String... columns) {
            return columns(List.of(columns));
        }
        public Builder countryCode(@Nullable DataSetGeoSpatialCountryCode countryCode) {
            this.countryCode = countryCode;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }        public DataSetGeoSpatialColumnGroup build() {
            return new DataSetGeoSpatialColumnGroup(columns, countryCode, name);
        }
    }
}
