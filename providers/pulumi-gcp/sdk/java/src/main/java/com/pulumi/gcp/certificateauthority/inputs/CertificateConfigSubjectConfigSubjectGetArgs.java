// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.certificateauthority.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CertificateConfigSubjectConfigSubjectGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final CertificateConfigSubjectConfigSubjectGetArgs Empty = new CertificateConfigSubjectConfigSubjectGetArgs();

    /**
     * The common name of the distinguished name.
     * 
     */
    @Import(name="commonName", required=true)
    private Output<String> commonName;

    public Output<String> commonName() {
        return this.commonName;
    }

    /**
     * The country code of the subject.
     * 
     */
    @Import(name="countryCode")
    private @Nullable Output<String> countryCode;

    public Optional<Output<String>> countryCode() {
        return Optional.ofNullable(this.countryCode);
    }

    /**
     * The locality or city of the subject.
     * 
     */
    @Import(name="locality")
    private @Nullable Output<String> locality;

    public Optional<Output<String>> locality() {
        return Optional.ofNullable(this.locality);
    }

    /**
     * The organization of the subject.
     * 
     */
    @Import(name="organization", required=true)
    private Output<String> organization;

    public Output<String> organization() {
        return this.organization;
    }

    /**
     * The organizational unit of the subject.
     * 
     */
    @Import(name="organizationalUnit")
    private @Nullable Output<String> organizationalUnit;

    public Optional<Output<String>> organizationalUnit() {
        return Optional.ofNullable(this.organizationalUnit);
    }

    /**
     * The postal code of the subject.
     * 
     */
    @Import(name="postalCode")
    private @Nullable Output<String> postalCode;

    public Optional<Output<String>> postalCode() {
        return Optional.ofNullable(this.postalCode);
    }

    /**
     * The province, territory, or regional state of the subject.
     * 
     */
    @Import(name="province")
    private @Nullable Output<String> province;

    public Optional<Output<String>> province() {
        return Optional.ofNullable(this.province);
    }

    /**
     * The street address of the subject.
     * 
     */
    @Import(name="streetAddress")
    private @Nullable Output<String> streetAddress;

    public Optional<Output<String>> streetAddress() {
        return Optional.ofNullable(this.streetAddress);
    }

    private CertificateConfigSubjectConfigSubjectGetArgs() {}

    private CertificateConfigSubjectConfigSubjectGetArgs(CertificateConfigSubjectConfigSubjectGetArgs $) {
        this.commonName = $.commonName;
        this.countryCode = $.countryCode;
        this.locality = $.locality;
        this.organization = $.organization;
        this.organizationalUnit = $.organizationalUnit;
        this.postalCode = $.postalCode;
        this.province = $.province;
        this.streetAddress = $.streetAddress;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CertificateConfigSubjectConfigSubjectGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CertificateConfigSubjectConfigSubjectGetArgs $;

        public Builder() {
            $ = new CertificateConfigSubjectConfigSubjectGetArgs();
        }

        public Builder(CertificateConfigSubjectConfigSubjectGetArgs defaults) {
            $ = new CertificateConfigSubjectConfigSubjectGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder commonName(Output<String> commonName) {
            $.commonName = commonName;
            return this;
        }

        public Builder commonName(String commonName) {
            return commonName(Output.of(commonName));
        }

        public Builder countryCode(@Nullable Output<String> countryCode) {
            $.countryCode = countryCode;
            return this;
        }

        public Builder countryCode(String countryCode) {
            return countryCode(Output.of(countryCode));
        }

        public Builder locality(@Nullable Output<String> locality) {
            $.locality = locality;
            return this;
        }

        public Builder locality(String locality) {
            return locality(Output.of(locality));
        }

        public Builder organization(Output<String> organization) {
            $.organization = organization;
            return this;
        }

        public Builder organization(String organization) {
            return organization(Output.of(organization));
        }

        public Builder organizationalUnit(@Nullable Output<String> organizationalUnit) {
            $.organizationalUnit = organizationalUnit;
            return this;
        }

        public Builder organizationalUnit(String organizationalUnit) {
            return organizationalUnit(Output.of(organizationalUnit));
        }

        public Builder postalCode(@Nullable Output<String> postalCode) {
            $.postalCode = postalCode;
            return this;
        }

        public Builder postalCode(String postalCode) {
            return postalCode(Output.of(postalCode));
        }

        public Builder province(@Nullable Output<String> province) {
            $.province = province;
            return this;
        }

        public Builder province(String province) {
            return province(Output.of(province));
        }

        public Builder streetAddress(@Nullable Output<String> streetAddress) {
            $.streetAddress = streetAddress;
            return this;
        }

        public Builder streetAddress(String streetAddress) {
            return streetAddress(Output.of(streetAddress));
        }

        public CertificateConfigSubjectConfigSubjectGetArgs build() {
            $.commonName = Objects.requireNonNull($.commonName, "expected parameter 'commonName' to be non-null");
            $.organization = Objects.requireNonNull($.organization, "expected parameter 'organization' to be non-null");
            return $;
        }
    }

}
