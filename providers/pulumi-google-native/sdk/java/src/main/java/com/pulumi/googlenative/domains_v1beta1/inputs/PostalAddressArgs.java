// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.domains_v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Represents a postal address, e.g. for postal delivery or payments addresses. Given a postal address, a postal service can deliver items to a premise, P.O. Box or similar. It is not intended to model geographical locations (roads, towns, mountains). In typical usage an address would be created via user input or from importing existing data, depending on the type of process. Advice on address input / editing: - Use an i18n-ready address widget such as https://github.com/google/libaddressinput) - Users should not be presented with UI elements for input or editing of fields outside countries where that field is used. For more guidance on how to use this schema, please see: https://support.google.com/business/answer/6397478
 * 
 */
public final class PostalAddressArgs extends com.pulumi.resources.ResourceArgs {

    public static final PostalAddressArgs Empty = new PostalAddressArgs();

    /**
     * Unstructured address lines describing the lower levels of an address. Because values in address_lines do not have type information and may sometimes contain multiple values in a single field (e.g. "Austin, TX"), it is important that the line order is clear. The order of address lines should be "envelope order" for the country/region of the address. In places where this can vary (e.g. Japan), address_language is used to make it explicit (e.g. "ja" for large-to-small ordering and "ja-Latn" or "en" for small-to-large). This way, the most specific line of an address can be selected based on the language. The minimum permitted structural representation of an address consists of a region_code with all remaining information placed in the address_lines. It would be possible to format such an address very approximately without geocoding, but no semantic reasoning could be made about any of the address components until it was at least partially resolved. Creating an address only containing a region_code and address_lines, and then geocoding is the recommended way to handle completely unstructured addresses (as opposed to guessing which parts of the address should be localities or administrative areas).
     * 
     */
    @Import(name="addressLines")
      private final @Nullable Output<List<String>> addressLines;

    public Output<List<String>> addressLines() {
        return this.addressLines == null ? Codegen.empty() : this.addressLines;
    }

    /**
     * Optional. Highest administrative subdivision which is used for postal addresses of a country or region. For example, this can be a state, a province, an oblast, or a prefecture. Specifically, for Spain this is the province and not the autonomous community (e.g. "Barcelona" and not "Catalonia"). Many countries don't use an administrative area in postal addresses. E.g. in Switzerland this should be left unpopulated.
     * 
     */
    @Import(name="administrativeArea")
      private final @Nullable Output<String> administrativeArea;

    public Output<String> administrativeArea() {
        return this.administrativeArea == null ? Codegen.empty() : this.administrativeArea;
    }

    /**
     * Optional. BCP-47 language code of the contents of this address (if known). This is often the UI language of the input form or is expected to match one of the languages used in the address' country/region, or their transliterated equivalents. This can affect formatting in certain countries, but is not critical to the correctness of the data and will never affect any validation or other non-formatting related operations. If this value is not known, it should be omitted (rather than specifying a possibly incorrect default). Examples: "zh-Hant", "ja", "ja-Latn", "en".
     * 
     */
    @Import(name="languageCode")
      private final @Nullable Output<String> languageCode;

    public Output<String> languageCode() {
        return this.languageCode == null ? Codegen.empty() : this.languageCode;
    }

    /**
     * Optional. Generally refers to the city/town portion of the address. Examples: US city, IT comune, UK post town. In regions of the world where localities are not well defined or do not fit into this structure well, leave locality empty and use address_lines.
     * 
     */
    @Import(name="locality")
      private final @Nullable Output<String> locality;

    public Output<String> locality() {
        return this.locality == null ? Codegen.empty() : this.locality;
    }

    /**
     * Optional. The name of the organization at the address.
     * 
     */
    @Import(name="organization")
      private final @Nullable Output<String> organization;

    public Output<String> organization() {
        return this.organization == null ? Codegen.empty() : this.organization;
    }

    /**
     * Optional. Postal code of the address. Not all countries use or require postal codes to be present, but where they are used, they may trigger additional validation with other parts of the address (e.g. state/zip validation in the U.S.A.).
     * 
     */
    @Import(name="postalCode")
      private final @Nullable Output<String> postalCode;

    public Output<String> postalCode() {
        return this.postalCode == null ? Codegen.empty() : this.postalCode;
    }

    /**
     * Optional. The recipient at the address. This field may, under certain circumstances, contain multiline information. For example, it might contain "care of" information.
     * 
     */
    @Import(name="recipients")
      private final @Nullable Output<List<String>> recipients;

    public Output<List<String>> recipients() {
        return this.recipients == null ? Codegen.empty() : this.recipients;
    }

    /**
     * CLDR region code of the country/region of the address. This is never inferred and it is up to the user to ensure the value is correct. See http://cldr.unicode.org/ and http://www.unicode.org/cldr/charts/30/supplemental/territory_information.html for details. Example: "CH" for Switzerland.
     * 
     */
    @Import(name="regionCode", required=true)
      private final Output<String> regionCode;

    public Output<String> regionCode() {
        return this.regionCode;
    }

    /**
     * The schema revision of the `PostalAddress`. This must be set to 0, which is the latest revision. All new revisions **must** be backward compatible with old revisions.
     * 
     */
    @Import(name="revision")
      private final @Nullable Output<Integer> revision;

    public Output<Integer> revision() {
        return this.revision == null ? Codegen.empty() : this.revision;
    }

    /**
     * Optional. Additional, country-specific, sorting code. This is not used in most regions. Where it is used, the value is either a string like "CEDEX", optionally followed by a number (e.g. "CEDEX 7"), or just a number alone, representing the "sector code" (Jamaica), "delivery area indicator" (Malawi) or "post office indicator" (e.g. Côte d'Ivoire).
     * 
     */
    @Import(name="sortingCode")
      private final @Nullable Output<String> sortingCode;

    public Output<String> sortingCode() {
        return this.sortingCode == null ? Codegen.empty() : this.sortingCode;
    }

    /**
     * Optional. Sublocality of the address. For example, this can be neighborhoods, boroughs, districts.
     * 
     */
    @Import(name="sublocality")
      private final @Nullable Output<String> sublocality;

    public Output<String> sublocality() {
        return this.sublocality == null ? Codegen.empty() : this.sublocality;
    }

    public PostalAddressArgs(
        @Nullable Output<List<String>> addressLines,
        @Nullable Output<String> administrativeArea,
        @Nullable Output<String> languageCode,
        @Nullable Output<String> locality,
        @Nullable Output<String> organization,
        @Nullable Output<String> postalCode,
        @Nullable Output<List<String>> recipients,
        Output<String> regionCode,
        @Nullable Output<Integer> revision,
        @Nullable Output<String> sortingCode,
        @Nullable Output<String> sublocality) {
        this.addressLines = addressLines;
        this.administrativeArea = administrativeArea;
        this.languageCode = languageCode;
        this.locality = locality;
        this.organization = organization;
        this.postalCode = postalCode;
        this.recipients = recipients;
        this.regionCode = Objects.requireNonNull(regionCode, "expected parameter 'regionCode' to be non-null");
        this.revision = revision;
        this.sortingCode = sortingCode;
        this.sublocality = sublocality;
    }

    private PostalAddressArgs() {
        this.addressLines = Codegen.empty();
        this.administrativeArea = Codegen.empty();
        this.languageCode = Codegen.empty();
        this.locality = Codegen.empty();
        this.organization = Codegen.empty();
        this.postalCode = Codegen.empty();
        this.recipients = Codegen.empty();
        this.regionCode = Codegen.empty();
        this.revision = Codegen.empty();
        this.sortingCode = Codegen.empty();
        this.sublocality = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PostalAddressArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> addressLines;
        private @Nullable Output<String> administrativeArea;
        private @Nullable Output<String> languageCode;
        private @Nullable Output<String> locality;
        private @Nullable Output<String> organization;
        private @Nullable Output<String> postalCode;
        private @Nullable Output<List<String>> recipients;
        private Output<String> regionCode;
        private @Nullable Output<Integer> revision;
        private @Nullable Output<String> sortingCode;
        private @Nullable Output<String> sublocality;

        public Builder() {
    	      // Empty
        }

        public Builder(PostalAddressArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addressLines = defaults.addressLines;
    	      this.administrativeArea = defaults.administrativeArea;
    	      this.languageCode = defaults.languageCode;
    	      this.locality = defaults.locality;
    	      this.organization = defaults.organization;
    	      this.postalCode = defaults.postalCode;
    	      this.recipients = defaults.recipients;
    	      this.regionCode = defaults.regionCode;
    	      this.revision = defaults.revision;
    	      this.sortingCode = defaults.sortingCode;
    	      this.sublocality = defaults.sublocality;
        }

        public Builder addressLines(@Nullable Output<List<String>> addressLines) {
            this.addressLines = addressLines;
            return this;
        }
        public Builder addressLines(@Nullable List<String> addressLines) {
            this.addressLines = Codegen.ofNullable(addressLines);
            return this;
        }
        public Builder addressLines(String... addressLines) {
            return addressLines(List.of(addressLines));
        }
        public Builder administrativeArea(@Nullable Output<String> administrativeArea) {
            this.administrativeArea = administrativeArea;
            return this;
        }
        public Builder administrativeArea(@Nullable String administrativeArea) {
            this.administrativeArea = Codegen.ofNullable(administrativeArea);
            return this;
        }
        public Builder languageCode(@Nullable Output<String> languageCode) {
            this.languageCode = languageCode;
            return this;
        }
        public Builder languageCode(@Nullable String languageCode) {
            this.languageCode = Codegen.ofNullable(languageCode);
            return this;
        }
        public Builder locality(@Nullable Output<String> locality) {
            this.locality = locality;
            return this;
        }
        public Builder locality(@Nullable String locality) {
            this.locality = Codegen.ofNullable(locality);
            return this;
        }
        public Builder organization(@Nullable Output<String> organization) {
            this.organization = organization;
            return this;
        }
        public Builder organization(@Nullable String organization) {
            this.organization = Codegen.ofNullable(organization);
            return this;
        }
        public Builder postalCode(@Nullable Output<String> postalCode) {
            this.postalCode = postalCode;
            return this;
        }
        public Builder postalCode(@Nullable String postalCode) {
            this.postalCode = Codegen.ofNullable(postalCode);
            return this;
        }
        public Builder recipients(@Nullable Output<List<String>> recipients) {
            this.recipients = recipients;
            return this;
        }
        public Builder recipients(@Nullable List<String> recipients) {
            this.recipients = Codegen.ofNullable(recipients);
            return this;
        }
        public Builder recipients(String... recipients) {
            return recipients(List.of(recipients));
        }
        public Builder regionCode(Output<String> regionCode) {
            this.regionCode = Objects.requireNonNull(regionCode);
            return this;
        }
        public Builder regionCode(String regionCode) {
            this.regionCode = Output.of(Objects.requireNonNull(regionCode));
            return this;
        }
        public Builder revision(@Nullable Output<Integer> revision) {
            this.revision = revision;
            return this;
        }
        public Builder revision(@Nullable Integer revision) {
            this.revision = Codegen.ofNullable(revision);
            return this;
        }
        public Builder sortingCode(@Nullable Output<String> sortingCode) {
            this.sortingCode = sortingCode;
            return this;
        }
        public Builder sortingCode(@Nullable String sortingCode) {
            this.sortingCode = Codegen.ofNullable(sortingCode);
            return this;
        }
        public Builder sublocality(@Nullable Output<String> sublocality) {
            this.sublocality = sublocality;
            return this;
        }
        public Builder sublocality(@Nullable String sublocality) {
            this.sublocality = Codegen.ofNullable(sublocality);
            return this;
        }        public PostalAddressArgs build() {
            return new PostalAddressArgs(addressLines, administrativeArea, languageCode, locality, organization, postalCode, recipients, regionCode, revision, sortingCode, sublocality);
        }
    }
}
