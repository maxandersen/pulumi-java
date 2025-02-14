// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.route53recoveryreadiness.outputs;

import com.pulumi.awsnative.route53recoveryreadiness.outputs.CellTag;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetCellResult {
    /**
     * @return The Amazon Resource Name (ARN) of the cell.
     * 
     */
    private final @Nullable String cellArn;
    /**
     * @return A list of cell Amazon Resource Names (ARNs) contained within this cell, for use in nested cells. For example, Availability Zones within specific Regions.
     * 
     */
    private final @Nullable List<String> cells;
    /**
     * @return The readiness scope for the cell, which can be a cell Amazon Resource Name (ARN) or a recovery group ARN. This is a list but currently can have only one element.
     * 
     */
    private final @Nullable List<String> parentReadinessScopes;
    /**
     * @return A collection of tags associated with a resource
     * 
     */
    private final @Nullable List<CellTag> tags;

    @CustomType.Constructor
    private GetCellResult(
        @CustomType.Parameter("cellArn") @Nullable String cellArn,
        @CustomType.Parameter("cells") @Nullable List<String> cells,
        @CustomType.Parameter("parentReadinessScopes") @Nullable List<String> parentReadinessScopes,
        @CustomType.Parameter("tags") @Nullable List<CellTag> tags) {
        this.cellArn = cellArn;
        this.cells = cells;
        this.parentReadinessScopes = parentReadinessScopes;
        this.tags = tags;
    }

    /**
     * @return The Amazon Resource Name (ARN) of the cell.
     * 
     */
    public Optional<String> cellArn() {
        return Optional.ofNullable(this.cellArn);
    }
    /**
     * @return A list of cell Amazon Resource Names (ARNs) contained within this cell, for use in nested cells. For example, Availability Zones within specific Regions.
     * 
     */
    public List<String> cells() {
        return this.cells == null ? List.of() : this.cells;
    }
    /**
     * @return The readiness scope for the cell, which can be a cell Amazon Resource Name (ARN) or a recovery group ARN. This is a list but currently can have only one element.
     * 
     */
    public List<String> parentReadinessScopes() {
        return this.parentReadinessScopes == null ? List.of() : this.parentReadinessScopes;
    }
    /**
     * @return A collection of tags associated with a resource
     * 
     */
    public List<CellTag> tags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCellResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String cellArn;
        private @Nullable List<String> cells;
        private @Nullable List<String> parentReadinessScopes;
        private @Nullable List<CellTag> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCellResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cellArn = defaults.cellArn;
    	      this.cells = defaults.cells;
    	      this.parentReadinessScopes = defaults.parentReadinessScopes;
    	      this.tags = defaults.tags;
        }

        public Builder cellArn(@Nullable String cellArn) {
            this.cellArn = cellArn;
            return this;
        }
        public Builder cells(@Nullable List<String> cells) {
            this.cells = cells;
            return this;
        }
        public Builder cells(String... cells) {
            return cells(List.of(cells));
        }
        public Builder parentReadinessScopes(@Nullable List<String> parentReadinessScopes) {
            this.parentReadinessScopes = parentReadinessScopes;
            return this;
        }
        public Builder parentReadinessScopes(String... parentReadinessScopes) {
            return parentReadinessScopes(List.of(parentReadinessScopes));
        }
        public Builder tags(@Nullable List<CellTag> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(CellTag... tags) {
            return tags(List.of(tags));
        }        public GetCellResult build() {
            return new GetCellResult(cellArn, cells, parentReadinessScopes, tags);
        }
    }
}
