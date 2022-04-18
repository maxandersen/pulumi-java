// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.operationsmanagement.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Plan for solution object supported by the OperationsManagement resource provider.
 * 
 */
public final class SolutionPlanResponse extends com.pulumi.resources.InvokeArgs {

    public static final SolutionPlanResponse Empty = new SolutionPlanResponse();

    /**
     * name of the solution to be created. For Microsoft published solution it should be in the format of solutionType(workspaceName). SolutionType part is case sensitive. For third party solution, it can be anything.
     * 
     */
    @Import(name="name")
      private final @Nullable String name;

    public Optional<String> name() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * name of the solution to enabled/add. For Microsoft published gallery solution it should be in the format of OMSGallery/<solutionType>. This is case sensitive
     * 
     */
    @Import(name="product")
      private final @Nullable String product;

    public Optional<String> product() {
        return this.product == null ? Optional.empty() : Optional.ofNullable(this.product);
    }

    /**
     * promotionCode, Not really used now, can you left as empty
     * 
     */
    @Import(name="promotionCode")
      private final @Nullable String promotionCode;

    public Optional<String> promotionCode() {
        return this.promotionCode == null ? Optional.empty() : Optional.ofNullable(this.promotionCode);
    }

    /**
     * Publisher name. For gallery solution, it is Microsoft.
     * 
     */
    @Import(name="publisher")
      private final @Nullable String publisher;

    public Optional<String> publisher() {
        return this.publisher == null ? Optional.empty() : Optional.ofNullable(this.publisher);
    }

    public SolutionPlanResponse(
        @Nullable String name,
        @Nullable String product,
        @Nullable String promotionCode,
        @Nullable String publisher) {
        this.name = name;
        this.product = product;
        this.promotionCode = promotionCode;
        this.publisher = publisher;
    }

    private SolutionPlanResponse() {
        this.name = null;
        this.product = null;
        this.promotionCode = null;
        this.publisher = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SolutionPlanResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String name;
        private @Nullable String product;
        private @Nullable String promotionCode;
        private @Nullable String publisher;

        public Builder() {
    	      // Empty
        }

        public Builder(SolutionPlanResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.product = defaults.product;
    	      this.promotionCode = defaults.promotionCode;
    	      this.publisher = defaults.publisher;
        }

        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder product(@Nullable String product) {
            this.product = product;
            return this;
        }
        public Builder promotionCode(@Nullable String promotionCode) {
            this.promotionCode = promotionCode;
            return this;
        }
        public Builder publisher(@Nullable String publisher) {
            this.publisher = publisher;
            return this;
        }        public SolutionPlanResponse build() {
            return new SolutionPlanResponse(name, product, promotionCode, publisher);
        }
    }
}
