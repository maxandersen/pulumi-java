// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datacatalog_v1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.datacatalog_v1.inputs.GoogleCloudDatacatalogV1ContactsResponse;
import com.pulumi.googlenative.datacatalog_v1.inputs.GoogleCloudDatacatalogV1EntryOverviewResponse;
import java.util.Objects;


/**
 * Business Context of the entry.
 * 
 */
public final class GoogleCloudDatacatalogV1BusinessContextResponse extends com.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDatacatalogV1BusinessContextResponse Empty = new GoogleCloudDatacatalogV1BusinessContextResponse();

    /**
     * Contact people for the entry.
     * 
     */
    @Import(name="contacts", required=true)
      private final GoogleCloudDatacatalogV1ContactsResponse contacts;

    public GoogleCloudDatacatalogV1ContactsResponse contacts() {
        return this.contacts;
    }

    /**
     * Entry overview fields for rich text descriptions of entries.
     * 
     */
    @Import(name="entryOverview", required=true)
      private final GoogleCloudDatacatalogV1EntryOverviewResponse entryOverview;

    public GoogleCloudDatacatalogV1EntryOverviewResponse entryOverview() {
        return this.entryOverview;
    }

    public GoogleCloudDatacatalogV1BusinessContextResponse(
        GoogleCloudDatacatalogV1ContactsResponse contacts,
        GoogleCloudDatacatalogV1EntryOverviewResponse entryOverview) {
        this.contacts = Objects.requireNonNull(contacts, "expected parameter 'contacts' to be non-null");
        this.entryOverview = Objects.requireNonNull(entryOverview, "expected parameter 'entryOverview' to be non-null");
    }

    private GoogleCloudDatacatalogV1BusinessContextResponse() {
        this.contacts = null;
        this.entryOverview = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDatacatalogV1BusinessContextResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDatacatalogV1ContactsResponse contacts;
        private GoogleCloudDatacatalogV1EntryOverviewResponse entryOverview;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDatacatalogV1BusinessContextResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contacts = defaults.contacts;
    	      this.entryOverview = defaults.entryOverview;
        }

        public Builder contacts(GoogleCloudDatacatalogV1ContactsResponse contacts) {
            this.contacts = Objects.requireNonNull(contacts);
            return this;
        }
        public Builder entryOverview(GoogleCloudDatacatalogV1EntryOverviewResponse entryOverview) {
            this.entryOverview = Objects.requireNonNull(entryOverview);
            return this;
        }        public GoogleCloudDatacatalogV1BusinessContextResponse build() {
            return new GoogleCloudDatacatalogV1BusinessContextResponse(contacts, entryOverview);
        }
    }
}
