// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.quicksight.outputs;

import com.pulumi.awsnative.quicksight.enums.DataSetRowLevelPermissionFormatVersion;
import com.pulumi.awsnative.quicksight.enums.DataSetRowLevelPermissionPolicy;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DataSetRowLevelPermissionDataSet {
    /**
     * &lt;p&gt;The Amazon Resource Name (ARN) of the permission dataset.&lt;/p&gt;
     * 
     */
    private final String arn;
    private final @Nullable DataSetRowLevelPermissionFormatVersion formatVersion;
    /**
     * &lt;p&gt;The namespace associated with the row-level permissions dataset.&lt;/p&gt;
     * 
     */
    private final @Nullable String namespace;
    private final DataSetRowLevelPermissionPolicy permissionPolicy;

    @CustomType.Constructor
    private DataSetRowLevelPermissionDataSet(
        @CustomType.Parameter("arn") String arn,
        @CustomType.Parameter("formatVersion") @Nullable DataSetRowLevelPermissionFormatVersion formatVersion,
        @CustomType.Parameter("namespace") @Nullable String namespace,
        @CustomType.Parameter("permissionPolicy") DataSetRowLevelPermissionPolicy permissionPolicy) {
        this.arn = arn;
        this.formatVersion = formatVersion;
        this.namespace = namespace;
        this.permissionPolicy = permissionPolicy;
    }

    /**
     * &lt;p&gt;The Amazon Resource Name (ARN) of the permission dataset.&lt;/p&gt;
     * 
    */
    public String arn() {
        return this.arn;
    }
    public Optional<DataSetRowLevelPermissionFormatVersion> formatVersion() {
        return Optional.ofNullable(this.formatVersion);
    }
    /**
     * &lt;p&gt;The namespace associated with the row-level permissions dataset.&lt;/p&gt;
     * 
    */
    public Optional<String> namespace() {
        return Optional.ofNullable(this.namespace);
    }
    public DataSetRowLevelPermissionPolicy permissionPolicy() {
        return this.permissionPolicy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSetRowLevelPermissionDataSet defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private @Nullable DataSetRowLevelPermissionFormatVersion formatVersion;
        private @Nullable String namespace;
        private DataSetRowLevelPermissionPolicy permissionPolicy;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSetRowLevelPermissionDataSet defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.formatVersion = defaults.formatVersion;
    	      this.namespace = defaults.namespace;
    	      this.permissionPolicy = defaults.permissionPolicy;
        }

        public Builder arn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }
        public Builder formatVersion(@Nullable DataSetRowLevelPermissionFormatVersion formatVersion) {
            this.formatVersion = formatVersion;
            return this;
        }
        public Builder namespace(@Nullable String namespace) {
            this.namespace = namespace;
            return this;
        }
        public Builder permissionPolicy(DataSetRowLevelPermissionPolicy permissionPolicy) {
            this.permissionPolicy = Objects.requireNonNull(permissionPolicy);
            return this;
        }        public DataSetRowLevelPermissionDataSet build() {
            return new DataSetRowLevelPermissionDataSet(arn, formatVersion, namespace, permissionPolicy);
        }
    }
}
