// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datacatalog_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Fields specific for BigQuery routines.
 * 
 */
public final class GoogleCloudDatacatalogV1BigQueryRoutineSpecResponse extends com.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDatacatalogV1BigQueryRoutineSpecResponse Empty = new GoogleCloudDatacatalogV1BigQueryRoutineSpecResponse();

    /**
     * Paths of the imported libraries.
     * 
     */
    @Import(name="importedLibraries", required=true)
    private List<String> importedLibraries;

    public List<String> importedLibraries() {
        return this.importedLibraries;
    }

    private GoogleCloudDatacatalogV1BigQueryRoutineSpecResponse() {}

    private GoogleCloudDatacatalogV1BigQueryRoutineSpecResponse(GoogleCloudDatacatalogV1BigQueryRoutineSpecResponse $) {
        this.importedLibraries = $.importedLibraries;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudDatacatalogV1BigQueryRoutineSpecResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDatacatalogV1BigQueryRoutineSpecResponse $;

        public Builder() {
            $ = new GoogleCloudDatacatalogV1BigQueryRoutineSpecResponse();
        }

        public Builder(GoogleCloudDatacatalogV1BigQueryRoutineSpecResponse defaults) {
            $ = new GoogleCloudDatacatalogV1BigQueryRoutineSpecResponse(Objects.requireNonNull(defaults));
        }

        public Builder importedLibraries(List<String> importedLibraries) {
            $.importedLibraries = importedLibraries;
            return this;
        }

        public Builder importedLibraries(String... importedLibraries) {
            return importedLibraries(List.of(importedLibraries));
        }

        public GoogleCloudDatacatalogV1BigQueryRoutineSpecResponse build() {
            $.importedLibraries = Objects.requireNonNull($.importedLibraries, "expected parameter 'importedLibraries' to be non-null");
            return $;
        }
    }

}
