// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis_v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.containeranalysis_v1beta1.inputs.ExternalRefArgs;
import com.pulumi.googlenative.containeranalysis_v1beta1.inputs.LicenseArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * PackageInfoNote represents an SPDX Package Information section: https://spdx.github.io/spdx-spec/3-package-information/
 * 
 */
public final class PackageInfoNoteArgs extends com.pulumi.resources.ResourceArgs {

    public static final PackageInfoNoteArgs Empty = new PackageInfoNoteArgs();

    /**
     * Indicates whether the file content of this package has been available for or subjected to analysis when creating the SPDX document
     * 
     */
    @Import(name="analyzed")
      private final @Nullable Output<Boolean> analyzed;

    public Output<Boolean> analyzed() {
        return this.analyzed == null ? Codegen.empty() : this.analyzed;
    }

    /**
     * A place for the SPDX data creator to record, at the package level, acknowledgements that may be needed to be communicated in some contexts
     * 
     */
    @Import(name="attribution")
      private final @Nullable Output<String> attribution;

    public Output<String> attribution() {
        return this.attribution == null ? Codegen.empty() : this.attribution;
    }

    /**
     * Provide an independently reproducible mechanism that permits unique identification of a specific package that correlates to the data in this SPDX file
     * 
     */
    @Import(name="checksum")
      private final @Nullable Output<String> checksum;

    public Output<String> checksum() {
        return this.checksum == null ? Codegen.empty() : this.checksum;
    }

    /**
     * Identify the copyright holders of the package, as well as any dates present
     * 
     */
    @Import(name="copyright")
      private final @Nullable Output<String> copyright;

    public Output<String> copyright() {
        return this.copyright == null ? Codegen.empty() : this.copyright;
    }

    /**
     * A more detailed description of the package
     * 
     */
    @Import(name="detailedDescription")
      private final @Nullable Output<String> detailedDescription;

    public Output<String> detailedDescription() {
        return this.detailedDescription == null ? Codegen.empty() : this.detailedDescription;
    }

    /**
     * This section identifies the download Universal Resource Locator (URL), or a specific location within a version control system (VCS) for the package at the time that the SPDX file was created
     * 
     */
    @Import(name="downloadLocation")
      private final @Nullable Output<String> downloadLocation;

    public Output<String> downloadLocation() {
        return this.downloadLocation == null ? Codegen.empty() : this.downloadLocation;
    }

    /**
     * ExternalRef
     * 
     */
    @Import(name="externalRefs")
      private final @Nullable Output<List<ExternalRefArgs>> externalRefs;

    public Output<List<ExternalRefArgs>> externalRefs() {
        return this.externalRefs == null ? Codegen.empty() : this.externalRefs;
    }

    /**
     * Contain the license the SPDX file creator has concluded as governing the This field is to contain a list of all licenses found in the package. The relationship between licenses (i.e., conjunctive, disjunctive) is not specified in this field – it is simply a listing of all licenses found
     * 
     */
    @Import(name="filesLicenseInfo")
      private final @Nullable Output<List<String>> filesLicenseInfo;

    public Output<List<String>> filesLicenseInfo() {
        return this.filesLicenseInfo == null ? Codegen.empty() : this.filesLicenseInfo;
    }

    /**
     * Provide a place for the SPDX file creator to record a web site that serves as the package&#39;s home page
     * 
     */
    @Import(name="homePage")
      private final @Nullable Output<String> homePage;

    public Output<String> homePage() {
        return this.homePage == null ? Codegen.empty() : this.homePage;
    }

    /**
     * List the licenses that have been declared by the authors of the package
     * 
     */
    @Import(name="licenseDeclared")
      private final @Nullable Output<LicenseArgs> licenseDeclared;

    public Output<LicenseArgs> licenseDeclared() {
        return this.licenseDeclared == null ? Codegen.empty() : this.licenseDeclared;
    }

    /**
     * If the package identified in the SPDX file originated from a different person or organization than identified as Package Supplier, this field identifies from where or whom the package originally came
     * 
     */
    @Import(name="originator")
      private final @Nullable Output<String> originator;

    public Output<String> originator() {
        return this.originator == null ? Codegen.empty() : this.originator;
    }

    /**
     * The type of package: OS, MAVEN, GO, GO_STDLIB, etc.
     * 
     */
    @Import(name="packageType")
      private final @Nullable Output<String> packageType;

    public Output<String> packageType() {
        return this.packageType == null ? Codegen.empty() : this.packageType;
    }

    /**
     * A short description of the package
     * 
     */
    @Import(name="summaryDescription")
      private final @Nullable Output<String> summaryDescription;

    public Output<String> summaryDescription() {
        return this.summaryDescription == null ? Codegen.empty() : this.summaryDescription;
    }

    /**
     * Identify the actual distribution source for the package/directory identified in the SPDX file
     * 
     */
    @Import(name="supplier")
      private final @Nullable Output<String> supplier;

    public Output<String> supplier() {
        return this.supplier == null ? Codegen.empty() : this.supplier;
    }

    /**
     * Identify the full name of the package as given by the Package Originator
     * 
     */
    @Import(name="title")
      private final @Nullable Output<String> title;

    public Output<String> title() {
        return this.title == null ? Codegen.empty() : this.title;
    }

    /**
     * This field provides an independently reproducible mechanism identifying specific contents of a package based on the actual files (except the SPDX file itself, if it is included in the package) that make up each package and that correlates to the data in this SPDX file
     * 
     */
    @Import(name="verificationCode")
      private final @Nullable Output<String> verificationCode;

    public Output<String> verificationCode() {
        return this.verificationCode == null ? Codegen.empty() : this.verificationCode;
    }

    /**
     * Identify the version of the package
     * 
     */
    @Import(name="version")
      private final @Nullable Output<String> version;

    public Output<String> version() {
        return this.version == null ? Codegen.empty() : this.version;
    }

    public PackageInfoNoteArgs(
        @Nullable Output<Boolean> analyzed,
        @Nullable Output<String> attribution,
        @Nullable Output<String> checksum,
        @Nullable Output<String> copyright,
        @Nullable Output<String> detailedDescription,
        @Nullable Output<String> downloadLocation,
        @Nullable Output<List<ExternalRefArgs>> externalRefs,
        @Nullable Output<List<String>> filesLicenseInfo,
        @Nullable Output<String> homePage,
        @Nullable Output<LicenseArgs> licenseDeclared,
        @Nullable Output<String> originator,
        @Nullable Output<String> packageType,
        @Nullable Output<String> summaryDescription,
        @Nullable Output<String> supplier,
        @Nullable Output<String> title,
        @Nullable Output<String> verificationCode,
        @Nullable Output<String> version) {
        this.analyzed = analyzed;
        this.attribution = attribution;
        this.checksum = checksum;
        this.copyright = copyright;
        this.detailedDescription = detailedDescription;
        this.downloadLocation = downloadLocation;
        this.externalRefs = externalRefs;
        this.filesLicenseInfo = filesLicenseInfo;
        this.homePage = homePage;
        this.licenseDeclared = licenseDeclared;
        this.originator = originator;
        this.packageType = packageType;
        this.summaryDescription = summaryDescription;
        this.supplier = supplier;
        this.title = title;
        this.verificationCode = verificationCode;
        this.version = version;
    }

    private PackageInfoNoteArgs() {
        this.analyzed = Codegen.empty();
        this.attribution = Codegen.empty();
        this.checksum = Codegen.empty();
        this.copyright = Codegen.empty();
        this.detailedDescription = Codegen.empty();
        this.downloadLocation = Codegen.empty();
        this.externalRefs = Codegen.empty();
        this.filesLicenseInfo = Codegen.empty();
        this.homePage = Codegen.empty();
        this.licenseDeclared = Codegen.empty();
        this.originator = Codegen.empty();
        this.packageType = Codegen.empty();
        this.summaryDescription = Codegen.empty();
        this.supplier = Codegen.empty();
        this.title = Codegen.empty();
        this.verificationCode = Codegen.empty();
        this.version = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PackageInfoNoteArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> analyzed;
        private @Nullable Output<String> attribution;
        private @Nullable Output<String> checksum;
        private @Nullable Output<String> copyright;
        private @Nullable Output<String> detailedDescription;
        private @Nullable Output<String> downloadLocation;
        private @Nullable Output<List<ExternalRefArgs>> externalRefs;
        private @Nullable Output<List<String>> filesLicenseInfo;
        private @Nullable Output<String> homePage;
        private @Nullable Output<LicenseArgs> licenseDeclared;
        private @Nullable Output<String> originator;
        private @Nullable Output<String> packageType;
        private @Nullable Output<String> summaryDescription;
        private @Nullable Output<String> supplier;
        private @Nullable Output<String> title;
        private @Nullable Output<String> verificationCode;
        private @Nullable Output<String> version;

        public Builder() {
    	      // Empty
        }

        public Builder(PackageInfoNoteArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.analyzed = defaults.analyzed;
    	      this.attribution = defaults.attribution;
    	      this.checksum = defaults.checksum;
    	      this.copyright = defaults.copyright;
    	      this.detailedDescription = defaults.detailedDescription;
    	      this.downloadLocation = defaults.downloadLocation;
    	      this.externalRefs = defaults.externalRefs;
    	      this.filesLicenseInfo = defaults.filesLicenseInfo;
    	      this.homePage = defaults.homePage;
    	      this.licenseDeclared = defaults.licenseDeclared;
    	      this.originator = defaults.originator;
    	      this.packageType = defaults.packageType;
    	      this.summaryDescription = defaults.summaryDescription;
    	      this.supplier = defaults.supplier;
    	      this.title = defaults.title;
    	      this.verificationCode = defaults.verificationCode;
    	      this.version = defaults.version;
        }

        public Builder analyzed(@Nullable Output<Boolean> analyzed) {
            this.analyzed = analyzed;
            return this;
        }
        public Builder analyzed(@Nullable Boolean analyzed) {
            this.analyzed = Codegen.ofNullable(analyzed);
            return this;
        }
        public Builder attribution(@Nullable Output<String> attribution) {
            this.attribution = attribution;
            return this;
        }
        public Builder attribution(@Nullable String attribution) {
            this.attribution = Codegen.ofNullable(attribution);
            return this;
        }
        public Builder checksum(@Nullable Output<String> checksum) {
            this.checksum = checksum;
            return this;
        }
        public Builder checksum(@Nullable String checksum) {
            this.checksum = Codegen.ofNullable(checksum);
            return this;
        }
        public Builder copyright(@Nullable Output<String> copyright) {
            this.copyright = copyright;
            return this;
        }
        public Builder copyright(@Nullable String copyright) {
            this.copyright = Codegen.ofNullable(copyright);
            return this;
        }
        public Builder detailedDescription(@Nullable Output<String> detailedDescription) {
            this.detailedDescription = detailedDescription;
            return this;
        }
        public Builder detailedDescription(@Nullable String detailedDescription) {
            this.detailedDescription = Codegen.ofNullable(detailedDescription);
            return this;
        }
        public Builder downloadLocation(@Nullable Output<String> downloadLocation) {
            this.downloadLocation = downloadLocation;
            return this;
        }
        public Builder downloadLocation(@Nullable String downloadLocation) {
            this.downloadLocation = Codegen.ofNullable(downloadLocation);
            return this;
        }
        public Builder externalRefs(@Nullable Output<List<ExternalRefArgs>> externalRefs) {
            this.externalRefs = externalRefs;
            return this;
        }
        public Builder externalRefs(@Nullable List<ExternalRefArgs> externalRefs) {
            this.externalRefs = Codegen.ofNullable(externalRefs);
            return this;
        }
        public Builder externalRefs(ExternalRefArgs... externalRefs) {
            return externalRefs(List.of(externalRefs));
        }
        public Builder filesLicenseInfo(@Nullable Output<List<String>> filesLicenseInfo) {
            this.filesLicenseInfo = filesLicenseInfo;
            return this;
        }
        public Builder filesLicenseInfo(@Nullable List<String> filesLicenseInfo) {
            this.filesLicenseInfo = Codegen.ofNullable(filesLicenseInfo);
            return this;
        }
        public Builder filesLicenseInfo(String... filesLicenseInfo) {
            return filesLicenseInfo(List.of(filesLicenseInfo));
        }
        public Builder homePage(@Nullable Output<String> homePage) {
            this.homePage = homePage;
            return this;
        }
        public Builder homePage(@Nullable String homePage) {
            this.homePage = Codegen.ofNullable(homePage);
            return this;
        }
        public Builder licenseDeclared(@Nullable Output<LicenseArgs> licenseDeclared) {
            this.licenseDeclared = licenseDeclared;
            return this;
        }
        public Builder licenseDeclared(@Nullable LicenseArgs licenseDeclared) {
            this.licenseDeclared = Codegen.ofNullable(licenseDeclared);
            return this;
        }
        public Builder originator(@Nullable Output<String> originator) {
            this.originator = originator;
            return this;
        }
        public Builder originator(@Nullable String originator) {
            this.originator = Codegen.ofNullable(originator);
            return this;
        }
        public Builder packageType(@Nullable Output<String> packageType) {
            this.packageType = packageType;
            return this;
        }
        public Builder packageType(@Nullable String packageType) {
            this.packageType = Codegen.ofNullable(packageType);
            return this;
        }
        public Builder summaryDescription(@Nullable Output<String> summaryDescription) {
            this.summaryDescription = summaryDescription;
            return this;
        }
        public Builder summaryDescription(@Nullable String summaryDescription) {
            this.summaryDescription = Codegen.ofNullable(summaryDescription);
            return this;
        }
        public Builder supplier(@Nullable Output<String> supplier) {
            this.supplier = supplier;
            return this;
        }
        public Builder supplier(@Nullable String supplier) {
            this.supplier = Codegen.ofNullable(supplier);
            return this;
        }
        public Builder title(@Nullable Output<String> title) {
            this.title = title;
            return this;
        }
        public Builder title(@Nullable String title) {
            this.title = Codegen.ofNullable(title);
            return this;
        }
        public Builder verificationCode(@Nullable Output<String> verificationCode) {
            this.verificationCode = verificationCode;
            return this;
        }
        public Builder verificationCode(@Nullable String verificationCode) {
            this.verificationCode = Codegen.ofNullable(verificationCode);
            return this;
        }
        public Builder version(@Nullable Output<String> version) {
            this.version = version;
            return this;
        }
        public Builder version(@Nullable String version) {
            this.version = Codegen.ofNullable(version);
            return this;
        }        public PackageInfoNoteArgs build() {
            return new PackageInfoNoteArgs(analyzed, attribution, checksum, copyright, detailedDescription, downloadLocation, externalRefs, filesLicenseInfo, homePage, licenseDeclared, originator, packageType, summaryDescription, supplier, title, verificationCode, version);
        }
    }
}
