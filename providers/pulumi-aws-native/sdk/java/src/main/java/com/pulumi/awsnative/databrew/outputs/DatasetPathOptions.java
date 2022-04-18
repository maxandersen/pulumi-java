// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.databrew.outputs;

import com.pulumi.awsnative.databrew.outputs.DatasetFilesLimit;
import com.pulumi.awsnative.databrew.outputs.DatasetFilterExpression;
import com.pulumi.awsnative.databrew.outputs.DatasetPathParameter;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DatasetPathOptions {
    private final @Nullable DatasetFilesLimit filesLimit;
    private final @Nullable DatasetFilterExpression lastModifiedDateCondition;
    private final @Nullable List<DatasetPathParameter> parameters;

    @CustomType.Constructor
    private DatasetPathOptions(
        @CustomType.Parameter("filesLimit") @Nullable DatasetFilesLimit filesLimit,
        @CustomType.Parameter("lastModifiedDateCondition") @Nullable DatasetFilterExpression lastModifiedDateCondition,
        @CustomType.Parameter("parameters") @Nullable List<DatasetPathParameter> parameters) {
        this.filesLimit = filesLimit;
        this.lastModifiedDateCondition = lastModifiedDateCondition;
        this.parameters = parameters;
    }

    public Optional<DatasetFilesLimit> filesLimit() {
        return Optional.ofNullable(this.filesLimit);
    }
    public Optional<DatasetFilterExpression> lastModifiedDateCondition() {
        return Optional.ofNullable(this.lastModifiedDateCondition);
    }
    public List<DatasetPathParameter> parameters() {
        return this.parameters == null ? List.of() : this.parameters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatasetPathOptions defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable DatasetFilesLimit filesLimit;
        private @Nullable DatasetFilterExpression lastModifiedDateCondition;
        private @Nullable List<DatasetPathParameter> parameters;

        public Builder() {
    	      // Empty
        }

        public Builder(DatasetPathOptions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filesLimit = defaults.filesLimit;
    	      this.lastModifiedDateCondition = defaults.lastModifiedDateCondition;
    	      this.parameters = defaults.parameters;
        }

        public Builder filesLimit(@Nullable DatasetFilesLimit filesLimit) {
            this.filesLimit = filesLimit;
            return this;
        }
        public Builder lastModifiedDateCondition(@Nullable DatasetFilterExpression lastModifiedDateCondition) {
            this.lastModifiedDateCondition = lastModifiedDateCondition;
            return this;
        }
        public Builder parameters(@Nullable List<DatasetPathParameter> parameters) {
            this.parameters = parameters;
            return this;
        }
        public Builder parameters(DatasetPathParameter... parameters) {
            return parameters(List.of(parameters));
        }        public DatasetPathOptions build() {
            return new DatasetPathOptions(filesLimit, lastModifiedDateCondition, parameters);
        }
    }
}
