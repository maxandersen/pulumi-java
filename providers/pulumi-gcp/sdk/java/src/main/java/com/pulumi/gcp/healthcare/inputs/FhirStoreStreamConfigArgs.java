// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.healthcare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.healthcare.inputs.FhirStoreStreamConfigBigqueryDestinationArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FhirStoreStreamConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final FhirStoreStreamConfigArgs Empty = new FhirStoreStreamConfigArgs();

    /**
     * The destination BigQuery structure that contains both the dataset location and corresponding schema config.
     * The output is organized in one table per resource type. The server reuses the existing tables (if any) that
     * are named after the resource types, e.g. &#34;Patient&#34;, &#34;Observation&#34;. When there is no existing table for a given
     * resource type, the server attempts to create one.
     * See the [streaming config reference](https://cloud.google.com/healthcare/docs/reference/rest/v1beta1/projects.locations.datasets.fhirStores#streamconfig) for more details.
     * Structure is documented below.
     * 
     */
    @Import(name="bigqueryDestination", required=true)
      private final Output<FhirStoreStreamConfigBigqueryDestinationArgs> bigqueryDestination;

    public Output<FhirStoreStreamConfigBigqueryDestinationArgs> bigqueryDestination() {
        return this.bigqueryDestination;
    }

    /**
     * Supply a FHIR resource type (such as &#34;Patient&#34; or &#34;Observation&#34;). See
     * https://www.hl7.org/fhir/valueset-resource-types.html for a list of all FHIR resource types. The server treats
     * an empty list as an intent to stream all the supported resource types in this FHIR store.
     * 
     */
    @Import(name="resourceTypes")
      private final @Nullable Output<List<String>> resourceTypes;

    public Output<List<String>> resourceTypes() {
        return this.resourceTypes == null ? Codegen.empty() : this.resourceTypes;
    }

    public FhirStoreStreamConfigArgs(
        Output<FhirStoreStreamConfigBigqueryDestinationArgs> bigqueryDestination,
        @Nullable Output<List<String>> resourceTypes) {
        this.bigqueryDestination = Objects.requireNonNull(bigqueryDestination, "expected parameter 'bigqueryDestination' to be non-null");
        this.resourceTypes = resourceTypes;
    }

    private FhirStoreStreamConfigArgs() {
        this.bigqueryDestination = Codegen.empty();
        this.resourceTypes = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FhirStoreStreamConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<FhirStoreStreamConfigBigqueryDestinationArgs> bigqueryDestination;
        private @Nullable Output<List<String>> resourceTypes;

        public Builder() {
    	      // Empty
        }

        public Builder(FhirStoreStreamConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bigqueryDestination = defaults.bigqueryDestination;
    	      this.resourceTypes = defaults.resourceTypes;
        }

        public Builder bigqueryDestination(Output<FhirStoreStreamConfigBigqueryDestinationArgs> bigqueryDestination) {
            this.bigqueryDestination = Objects.requireNonNull(bigqueryDestination);
            return this;
        }
        public Builder bigqueryDestination(FhirStoreStreamConfigBigqueryDestinationArgs bigqueryDestination) {
            this.bigqueryDestination = Output.of(Objects.requireNonNull(bigqueryDestination));
            return this;
        }
        public Builder resourceTypes(@Nullable Output<List<String>> resourceTypes) {
            this.resourceTypes = resourceTypes;
            return this;
        }
        public Builder resourceTypes(@Nullable List<String> resourceTypes) {
            this.resourceTypes = Codegen.ofNullable(resourceTypes);
            return this;
        }
        public Builder resourceTypes(String... resourceTypes) {
            return resourceTypes(List.of(resourceTypes));
        }        public FhirStoreStreamConfigArgs build() {
            return new FhirStoreStreamConfigArgs(bigqueryDestination, resourceTypes);
        }
    }
}
